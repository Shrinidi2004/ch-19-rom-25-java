class SatelliteDetails {
    static String name = "INSAT-3DR";
    static String launchDate = "2016-09-08";
    static String launchVehicle = "GSLV-F05";
    static String launchSite = "Sriharikota";
    static String orbitType = "Geostationary";
    static String purpose = "Weather Monitoring";
    static double weight = 2211.0;
    static String powerSource = "Solar Panels";
    static String owner = "ISRO";
    static String country = "India";
    static int operationalLife = 10;
    static String communicationBand = "C, S, X bands";
    static String payload = "Imaging Sensors";
    static String groundStation = "Hassan, Karnataka";
    static String controlCenter = "ISRO Telemetry Center";
    static String dataRate = "150 Mbps";
    static double altitude = 36000.0;
    static double speed = 11000.0;
    static double inclination = 0.1;
    static String status = "Active";

    public static void main(String[] Satellite) {
        System.out.println("Main started");
        System.out.println("Name: " + name);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Purpose: " + purpose);
        System.out.println("Weight: " + weight);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Owner: " + owner);
        System.out.println("Country: " + country);
        System.out.println("Operational Life: " + operationalLife);
        System.out.println("Communication Band: " + communicationBand);
        System.out.println("Payload: " + payload);
        System.out.println("Ground Station: " + groundStation);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Data Rate: " + dataRate);
        System.out.println("Altitude: " + altitude);
        System.out.println("Speed: " + speed);
        System.out.println("Inclination: " + inclination);
        System.out.println("Status: " + status);
        System.out.println("Main ended");
    }
}
