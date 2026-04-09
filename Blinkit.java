class Blinkit
{
    public double getPriceByFoodName(String foodName)
    {
        System.out.println("invoking getPriceByFoodName in Blinkit: " + foodName);
        double price = 0.0;

        // Using .equals() is the best practice for String comparison in Java
        if("Chicken rice".equals(foodName))
        {
            price = 100.0;
        }
        else if("Biriyani".equals(foodName))
        {
            price = 130.99;
        }
        else if("Egg curry".equals(foodName))
        {
            price = 80.99;
        }
        else if("Kushka".equals(foodName))
        {
            price = 100.99;
        }
        else if("rice samber".equals(foodName))
        {
            price = 60.0;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity)
    {
        System.out.println("invoking getTotalAmountByPriceAndQuantity");

        double totalAmount = price * quantity;

        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return totalAmount;
    }

    public double getDiscount(double totalAmount)
    {
        System.out.println("invoking getDiscount");

        // Applies a 10% discount
        double discountedPrice = totalAmount - (totalAmount * 0.10); 

        System.out.println("end of getDiscount");
        return discountedPrice;
    }
}