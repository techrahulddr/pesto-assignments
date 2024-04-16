package com.advertisex.dataengineering.ingestion;

import org.apache.avro.generic.GenericRecord;

public class AvroDataIngester {

    public void ingest(GenericRecord genericRecord) {
        // Process Avro data (bid requests)
        String userId = genericRecord.get("user_id").toString();
        String auctionId = genericRecord.get("auction_id").toString();
        String adTargeting = genericRecord.get("ad_targeting").toString();

        // Process the data (e.g., store in database or further processing)
        System.out.println("Ingested Avro data: UserID=" + userId +
                ", AuctionID=" + auctionId +
                ", AdTargeting=" + adTargeting);
    }
}
