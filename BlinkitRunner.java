 class BlinkitRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create an object of the Blinkit class
        Blinkit blinkit = new Blinkit();

        // 2. Define the order details
        String item = "Fried Rice";
        int quantity = 2;

        System.out.println("--- Starting  Order System ---");

        // 3. Get the price for the specific food item
        double pricePerItem = blinkit.getPriceByFoodName(item);

        if (pricePerItem > 0) 
        {
            // 4. Calculate total amount based on quantity
            double totalAmount = blinkit.getTotalAmountByPriceAndQuantity(pricePerItem, quantity);
            System.out.println("Total for " + quantity + " " + item + "(s): " + totalAmount);

            // 5. Calculate final price after a 10% discount
            double finalPrice = blinkit.getDiscount(totalAmount);
            
            
            System.out.println("Final Bill (After 10% Discount): " + finalPrice);
            
        } 
        else 
        {
            System.out.println("Sorry, " + item + " is not available on our menu.");
        }
    }
}