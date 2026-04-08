class Shop {

    String shopName;
    String location;
    String ownerName;
    String shopType;
    static int openingHours = 8; 
    double dailyIncome;

    public Shop() {
    }

    public Shop(String shopName, String location, String ownerName, String shopType, double dailyIncome) {
        this.shopName = shopName;
        this.location = location;
        this.ownerName = ownerName;
        this.shopType = shopType;
        this.dailyIncome = dailyIncome;
    }

    public void displayShopDetails() {
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Shop Type: " + shopType);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Daily Income: " + dailyIncome);
    }
}

