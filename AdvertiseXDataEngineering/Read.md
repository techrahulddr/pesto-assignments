# AdvertiseX Data Engineering Project

This project implements a data engineering solution for AdvertiseX, a digital advertising technology company, to handle data ingestion, processing, storage, and monitoring of advertising campaign data.

## Overview

The project addresses the following challenges:
- **Data Sources and Formats**:
    - Ad Impressions: JSON format
    - Clicks and Conversions: CSV format
    - Bid Requests: Avro format
- **Case Study Requirements**:
    - Data Ingestion: Collect and process ad impressions, clicks/conversions, and bid requests.
    - Data Processing: Transform, standardize, and enrich data.
    - Data Storage and Query Performance: Store processed data efficiently for fast querying.
    - Error Handling and Monitoring: Detect anomalies and ensure data quality in real-time.

## Project Structure

The project is structured as follows:
- `src/main/java`: Contains Java source files.
    - `com.advertisex.dataengineering.ingestion`: Classes for data ingestion.
    - `com.advertisex.dataengineering.processing`: Classes for data processing.
    - `com.advertisex.dataengineering.storage`: Classes for data storage and querying.
    - `com.advertisex.dataengineering.monitoring`: Classes for error handling and monitoring.
- `src/main/resources`: Contains configuration files.
- `src/test/java`: Contains test cases.

## Dependencies

The project uses the following dependencies managed by Maven:
- `org.json:json`: Library for JSON processing.
- `org.apache.commons:commons-csv`: Library for CSV parsing.
- `org.apache.avro:avro`: Library for Avro data format support.

## Getting Started

Follow these steps to set up and run the project:

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed.
- Apache Maven installed.

### Build and Run

1. **Clone the Repository**:
   ```bash
   //git clone https://github.com/your-username/advertise-x-data-engineering.git


1: Navigate to Project Directory:
cd advertise-x-data-engineering

2:Build the Project
mvn clean package

3: Run the Main Application:
java -cp target/data-engineering-1.0-SNAPSHOT.jar com.advertisex.dataengineering.MainApplication

