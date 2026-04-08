class MobileShop {

    String name;
    String location;
    int numberOfMobiles;
    int numberOfStaff;
    String managerName;
    boolean hasAccessories;
    boolean hasRepairService;
    double totalSales;
    int establishedYear;
    String shopType;

    static String country = "India";
    static String type = "Electronics";

    public String sellMobile(String mobile) {
        System.out.println("Mobile Sold: " + mobile);
        return mobile;
    }

    public String repairMobile(String mobile) {
        System.out.println("Mobile Repaired: " + mobile);
        return mobile;
    }

    public String stockMobile(String mobile) {
        System.out.println("Mobile Stocked: " + mobile);
        return mobile;
    }

    public double generateBill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public boolean openShop(boolean status) {
        System.out.println("Shop Open: " + status);
        return status;
    }

    public boolean closeShop(boolean status) {
        System.out.println("Shop Closed: " + status);
        return status;
    }

    public int countCustomers(int total) {
        System.out.println("Customers: " + total);
        return total;
    }

    public boolean provideWarranty(boolean status) {
        System.out.println("Warranty: " + status);
        return status;
    }

    public String assignSection(String section) {
        System.out.println("Section: " + section);
        return section;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}