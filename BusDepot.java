class BusDepot {

    String name;
    String location;
    int numberOfBuses;
    int numberOfDrivers;
    String managerName;
    boolean hasMaintenance;
    boolean hasParking;
    double totalRevenue;
    int establishedYear;
    String depotType;

    static String country = "India";
    static String type = "Transport";

    public String scheduleBus(String bus) {
        System.out.println("Bus Scheduled: " + bus);
        return bus;
    }

    public String cancelBus(String bus) {
        System.out.println("Bus Cancelled: " + bus);
        return bus;
    }

    public String assignDriver(String driver) {
        System.out.println("Driver Assigned: " + driver);
        return driver;
    }

    public double collectFare(double amount) {
        System.out.println("Fare: " + amount);
        return amount;
    }

    public boolean startBus(boolean status) {
        System.out.println("Bus Started: " + status);
        return status;
    }

    public boolean stopBus(boolean status) {
        System.out.println("Bus Stopped: " + status);
        return status;
    }

    public int countPassengers(int total) {
        System.out.println("Passengers: " + total);
        return total;
    }

    public boolean provideService(boolean status) {
        System.out.println("Service: " + status);
        return status;
    }

    public String assignRoute(String route) {
        System.out.println("Route Assigned: " + route);
        return route;
    }

    public boolean maintainVehicles(boolean status) {
        System.out.println("Vehicles Maintained: " + status);
        return status;
    }
}