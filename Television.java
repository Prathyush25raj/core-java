class Television
{
    static String tvNames[] = {
        "Samsung Smart TV",
        "LG OLED TV",
        "Sony Bravia 4K",
        "Mi Smart TV",
        "OnePlus QLED TV",
        "TCL Android TV",
        "Panasonic LED TV",
        "Vu Premium TV"
    };

    static float tvPrice[] = {
        45000f, 120000f, 85000f, 30000f, 65000f, 40000f, 42000f, 35000f
    };

    static double tvRatings[] = {
        4.6,4.8,4.7,4.4,4.5,4.3,4.4,4.2
    };

    static String tvBrand[] = {
        "Samsung","LG","Sony","Mi","OnePlus","TCL","Panasonic","Vu"
    };

    public static void getTvDetails()
    {
        for(int i=0;i<tvNames.length;i++)
        {
            System.out.println(tvNames[i]+" | "+tvPrice[i]+" | "+tvRatings[i]+" | "+tvBrand[i]);
        }
    }
}