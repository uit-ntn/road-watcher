package com.roadwatcher.models;
import java.util.List;

public class Pothole {
    private String id;
    private String potholeId;
    private double longitude;
    private double latitude;
    private String detectedTime;
    private String severity;
    private double accelerationX;
    private double accelerationY;
    private double accelerationZ;
    private double gpsAccuracy;
    private String detectedByUserId;
    private boolean confirmedByUser;
    private List<ManualReport> manualReports;

    public Pothole(String id, String potholeId, double longitude, double latitude, String detectedTime, String severity,
                   double accelerationX, double accelerationY, double accelerationZ, double gpsAccuracy,
                   String detectedByUserId, boolean confirmedByUser, List<ManualReport> manualReports) {
        this.id = id;
        this.potholeId = potholeId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.detectedTime = detectedTime;
        this.severity = severity;
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY;
        this.accelerationZ = accelerationZ;
        this.gpsAccuracy = gpsAccuracy;
        this.detectedByUserId = detectedByUserId;
        this.confirmedByUser = confirmedByUser;
        this.manualReports = manualReports;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPotholeId() { return potholeId; }
    public void setPotholeId(String potholeId) { this.potholeId = potholeId; }
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public String getDetectedTime() { return detectedTime; }
    public void setDetectedTime(String detectedTime) { this.detectedTime = detectedTime; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
    public double getAccelerationX() { return accelerationX; }
    public void setAccelerationX(double accelerationX) { this.accelerationX = accelerationX; }
    public double getAccelerationY() { return accelerationY; }
    public void setAccelerationY(double accelerationY) { this.accelerationY = accelerationY; }
    public double getAccelerationZ() { return accelerationZ; }
    public void setAccelerationZ(double accelerationZ) { this.accelerationZ = accelerationZ; }
    public double getGpsAccuracy() { return gpsAccuracy; }
    public void setGpsAccuracy(double gpsAccuracy) { this.gpsAccuracy = gpsAccuracy; }
    public String getDetectedByUserId() { return detectedByUserId; }
    public void setDetectedByUserId(String detectedByUserId) { this.detectedByUserId = detectedByUserId; }
    public boolean isConfirmedByUser() { return confirmedByUser; }
    public void setConfirmedByUser(boolean confirmedByUser) { this.confirmedByUser = confirmedByUser; }
    public List<ManualReport> getManualReports() { return manualReports; }
    public void setManualReports(List<ManualReport> manualReports) { this.manualReports = manualReports; }
}

class ManualReport {
    private String userId;
    private String reportTime;
    private String description;

    public ManualReport(String userId, String reportTime, String description) {
        this.userId = userId;
        this.reportTime = reportTime;
        this.description = description;
    }

    // Getters and setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getReportTime() { return reportTime; }
    public void setReportTime(String reportTime) { this.reportTime = reportTime; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}