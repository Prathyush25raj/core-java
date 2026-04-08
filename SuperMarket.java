class SuperMarket {

    String name;
    String location;
    int numberOfItems;
    int numberOfStaff;
    String managerName;
    boolean hasOnlineDelivery;
    boolean hasParking;
    double totalSales;
    int establishedYear;
    String marketType;

    static String country = "India";
    static String type = "Retail";

    public String buyItem(String item) {
        System.out.println("Item Bought: " + item);
        return item;
    }

    public String returnItem(String item) {
        System.out.println("Item Returned: " + item);
        return item;
    }

    public String stockItem(String item) {
        System.out.println("Item Stocked: " + item);
        return item;
    }

    public double generateBill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public boolean openMarket(boolean status) {
        System.out.println("Market Open: " + status);
        return status;
    }

    public boolean closeMarket(boolean status) {
        System.out.println("Market Closed: " + status);
        return status;
    }

    public int countCustomers(int total) {
        System.out.println("Customers: " + total);
        return total;
    }

    public boolean provideDiscount(boolean status) {
        System.out.println("Discount Available: " + status);
        return status;
    }

    public String assignSection(String section) {
        System.out.println("Section Assigned: " + section);
        return section;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}