class Farm {

    String name;
    String location;
    int numberOfCrops;
    int numberOfWorkers;
    String ownerName;
    boolean hasIrrigation;
    boolean hasStorage;
    double totalIncome;
    int establishedYear;
    String farmType;

    static String country = "India";
    static String type = "Agriculture";

    public String growCrop(String crop) {
        System.out.println("Crop Grown: " + crop);
        return crop;
    }

    public String harvestCrop(String crop) {
        System.out.println("Crop Harvested: " + crop);
        return crop;
    }

    public String sellCrop(String crop) {
        System.out.println("Crop Sold: " + crop);
        return crop;
    }

    public double calculateIncome(double amount) {
        System.out.println("Income: " + amount);
        return amount;
    }

    public boolean startWork(boolean status) {
        System.out.println("Work Started: " + status);
        return status;
    }

    public boolean stopWork(boolean status) {
        System.out.println("Work Stopped: " + status);
        return status;
    }

    public int countWorkers(int total) {
        System.out.println("Workers: " + total);
        return total;
    }

    public boolean provideWater(boolean status) {
        System.out.println("Water Provided: " + status);
        return status;
    }

    public String assignField(String field) {
        System.out.println("Field Assigned: " + field);
        return field;
    }

    public boolean maintainFarm(boolean status) {
        System.out.println("Farm Maintained: " + status);
        return status;
    }
}