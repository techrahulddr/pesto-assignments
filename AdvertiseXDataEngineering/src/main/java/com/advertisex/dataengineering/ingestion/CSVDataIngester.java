package com.advertisex.dataengineering.ingestion;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CSVDataIngester {

    public void ingest(String csvData) throws IOException {
        // Parse CSV data and process each record
        Reader reader = new StringReader(csvData);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());

        for (CSVRecord csvRecord : csvParser) {
            // Process each CSV record
            String userId = csvRecord.get("user_id");
            String timestamp = csvRecord.get("timestamp");
            String campaignId = csvRecord.get("campaign_id");
            String conversionType = csvRecord.get("conversion_type");

            // Process the data (e.g., store in database or further processing)
            System.out.println("Ingested CSV data: UserID=" + userId +
                    ", Timestamp=" + timestamp +
                    ", CampaignID=" + campaignId +
                    ", ConversionType=" + conversionType);
        }

        // Close the CSV parser and reader
        csvParser.close();
        reader.close();
    }
}
