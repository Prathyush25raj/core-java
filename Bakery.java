class Bakery {

    String name;
    String location;
    int numberOfItems;
    int numberOfStaff;
    String ownerName;
    boolean hasOnlineOrders;
    boolean hasDelivery;
    double totalSales;
    int establishedYear;
    String bakeryType;

    static String country = "India";
    static String type = "Food";

    public String bakeItem(String item) { System.out.println("Baked: " + item); return item; }
    public String sellItem(String item) { System.out.println("Sold: " + item); return item; }
    public String prepareItem(String item) { System.out.println("Prepared: " + item); return item; }
    public double generateBill(double amount) { System.out.println("Bill: " + amount); return amount; }
    public boolean openBakery(boolean status) { System.out.println("Open: " + status); return status; }
    public boolean closeBakery(boolean status) { System.out.println("Close: " + status); return status; }
    public int countCustomers(int total) { System.out.println("Customers: " + total); return total; }
    public boolean provideDelivery(boolean status) { System.out.println("Delivery: " + status); return status; }
    public String assignCounter(String counter) { System.out.println("Counter: " + counter); return counter; }
    public boolean maintainCleanliness(boolean status) { System.out.println("Cleanliness: " + status); return status; }
}