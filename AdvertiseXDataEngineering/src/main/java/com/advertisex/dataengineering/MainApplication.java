package com.advertisex.dataengineering;

import com.advertisex.dataengineering.ingestion.JSONDataIngester;
import com.advertisex.dataengineering.ingestion.CSVDataIngester;
import com.advertisex.dataengineering.processing.DataTransformer;
import com.advertisex.dataengineering.processing.DataProcessor;
import com.advertisex.dataengineering.storage.DataStorage;
import com.advertisex.dataengineering.monitoring.ErrorDetector;
import com.advertisex.dataengineering.monitoring.DataMonitor;

public class MainApplication {

    public static void main(String[] args) {
        // Simulated JSON data (ad impressions)
        String jsonData1 = "{ \"ad_creative_id\": \"abc123\", \"user_id\": \"user456\", \"timestamp\": \"2024-04-14T10:30:00\", \"website\": \"example.com\" }";
        String jsonData2 = "{ \"ad_creative_id\": \"def456\", \"user_id\": \"user789\", \"timestamp\": \"2024-04-14T12:45:00\", \"website\": \"example.org\" }";
        String jsonData3 = "{ \"ad_creative_id\": \"ghi789\", \"user_id\": \"user123\", \"timestamp\": \"2024-04-14T15:20:00\", \"website\": \"example.net\" }";

        // Simulated CSV data (clicks and conversions)
        String csvData = "user_id,timestamp,campaign_id,conversion_type\n" +
                "user456,2024-04-14T10:35:00,campaign123,purchase\n" +
                "user789,2024-04-14T12:50:00,campaign456,signup\n" +
                "user123,2024-04-14T15:25:00,campaign789,purchase";

        // Data ingestion
        JSONDataIngester jsonDataIngester = new JSONDataIngester();
        CSVDataIngester csvDataIngester = new CSVDataIngester();

        jsonDataIngester.ingest(jsonData1);
        jsonDataIngester.ingest(jsonData2);
        jsonDataIngester.ingest(jsonData3);

        try {
            csvDataIngester.ingest(csvData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Data processing
        DataTransformer dataTransformer = new DataTransformer();
        DataProcessor dataProcessor = new DataProcessor();

        dataTransformer.transformAndEnrich();
        dataProcessor.processData();

        // Data storage and querying
        DataStorage dataStorage = new DataStorage();
        dataStorage.storeProcessedData();
        dataStorage.queryData("SELECT * FROM processed_data");

        // Error handling and monitoring
        ErrorDetector errorDetector = new ErrorDetector();
        DataMonitor dataMonitor = new DataMonitor();

        errorDetector.detectErrors();
        dataMonitor.monitorData();

        // Simulation completed
        System.out.println("Data engineering simulation completed.");
    }
}
