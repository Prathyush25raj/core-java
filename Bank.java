class Bank {
    String bankName;
    String location;
    int numberOfAccounts;
    int numberOfEmployees;
    String managerName;
    boolean hasATM;
    boolean hasLoanFacility;
    double interestRate;
    int establishedYear;
    String bankType;

    static String country = "India";
    static String type = "Finance";

    public String openAccount(String name) {
        System.out.println("Account Opened: " + name);
        return name;
    }

    public String closeAccount(String name) {
        System.out.println("Account Closed: " + name);
        return name;
    }

    public double deposit(double amount) {
        System.out.println("Deposited: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
        return amount;
    }

    public boolean approveLoan(boolean status) {
        System.out.println("Loan Approved: " + status);
        return status;
    }

    public boolean blockCard(boolean status) {
        System.out.println("Card Blocked: " + status);
        return status;
    }

    public int totalCustomers(int total) {
        System.out.println("Customers: " + total);
        return total;
    }

    public boolean provideATM(boolean status) {
        System.out.println("ATM Service: " + status);
        return status;
    }

    public String assignManager(String name) {
        System.out.println("Manager Assigned: " + name);
        return name;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }
}