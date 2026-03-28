class AmazonProduct{
    static String productNames[] = {
        "Power Bank",
        "iPhone 15",
        "Nothing 3A",
        "LG Fridge",
        "Samsung Air Cooler",
        "Apple Smart Watch",
        "Led Telivision"
    };

    static float productPrice[] = {
        55999.5f, 60999.9f, 35999.0f, 44999.8f, 13999.5f, 11999.9f, 98999.0f
    };

    static double productRatings[] = {
        4.8, 4.7, 4.6, 4.5, 4.4, 4.3, 4.9
    };

    public static void main(String[]args);
	
	getAmazonProductDetails();
    {
        for(int i = 0; i < productNames.length; i++)
        {
            System.out.println("Product Name : " + productNames[i]);
            System.out.println("Product Price : " + productPrice[i]);
            System.out.println("Product Rating : " + productRatings[i]);
            System.out.println();
        }
    }
}