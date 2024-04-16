package com.advertisex.dataengineering.ingestion;

import org.json.JSONObject;

public class JSONDataIngester {

    public void ingest(String jsonData) {
        // Parse JSON data and process ad impressions
        JSONObject jsonObject = new JSONObject(jsonData);
        String adCreativeId = jsonObject.getString("ad_creative_id");
        String userId = jsonObject.getString("user_id");
        String timestamp = jsonObject.getString("timestamp");
        String website = jsonObject.getString("website");

        // Process the data (e.g., store in database or further processing)
        System.out.println("Ingested JSON data: AdCreativeID=" + adCreativeId +
                ", UserID=" + userId +
                ", Timestamp=" + timestamp +
                ", Website=" + website);
    }
}
