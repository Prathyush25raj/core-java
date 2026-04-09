class SwiggyRunner {
    public static void main(String[] args) {
        Swiggy s = new Swiggy();

        double price = s.getPrice("Pizza");
        double total = s.getTotal(price, 2);
        double finalAmount = s.getDiscount(total);

        System.out.println("Final Amount: " + finalAmount);
    }
}