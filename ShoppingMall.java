class ShoppingMall {

    String name;
    String location;
    int numberOfShops;
    int numberOfStaff;
    String managerName;
    boolean hasFoodCourt;
    boolean hasParking;
    double totalRevenue;
    int establishedYear;
    String mallType;

    static String country = "India";
    static String type = "Retail";

    public String openShop(String shop) {
        System.out.println("Shop Opened: " + shop);
        return shop;
    }

    public String closeShop(String shop) {
        System.out.println("Shop Closed: " + shop);
        return shop;
    }

    public String addShop(String shop) {
        System.out.println("Shop Added: " + shop);
        return shop;
    }

    public double collectRent(double amount) {
        System.out.println("Rent Collected: " + amount);
        return amount;
    }

    public boolean openMall(boolean status) {
        System.out.println("Mall Open: " + status);
        return status;
    }

    public boolean closeMall(boolean status) {
        System.out.println("Mall Closed: " + status);
        return status;
    }

    public int countVisitors(int total) {
        System.out.println("Visitors: " + total);
        return total;
    }

    public boolean provideSecurity(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }

    public String assignFloor(String floor) {
        System.out.println("Floor Assigned: " + floor);
        return floor;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}