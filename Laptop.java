class Laptop
{
    static String laptopNames[] = {
        "HP Pavilion",
        "Dell Inspiron",
        "Lenovo IdeaPad",
        "Apple MacBook Air",
        "Asus VivoBook",
        "Acer Aspire",
        "MSI Modern",
        "Samsung Galaxy Book"
    };

    static float laptopPrice[] = {
        65000f, 60000f, 55000f, 95000f, 52000f, 48000f, 70000f, 75000f
    };

    static double laptopRatings[] = {
        4.5,4.4,4.3,4.8,4.2,4.1,4.4,4.5
    };

    static String laptopBrand[] = {
        "HP","Dell","Lenovo","Apple","Asus","Acer","MSI","Samsung"
    };

    public static void getLaptopDetails()
    {
        for(int i=0;i<laptopNames.length;i++)
        {
            System.out.println(laptopNames[i]+" | "+laptopPrice[i]+" | "+laptopRatings[i]+" | "+laptopBrand[i]);
        }
    }
}