class Refrigerator
{
    
    static int RefrigeratorPrice[] = {
        80000, 30000, 28000, 44000, 45000,
        44000, 70000, 80000, 60000, 68000
    };

    
    static float RefrigeratorScreenSize[] = {
        50.0f, 60.0f, 56.5f, 45.0f, 50.0f,
        75.0f, 66.0f, 40.0f, 75.0f, 60.0f
    };

    
    static String RefrigeratorBrandName[]={
	    "Sony","LG","Samsung","Panasonic","IPL",
	    "Apple","OnePlus","Oppo","Philips","Sharp"
	};

    
    static short RefrigeratorWarrantyMonths[] = {
        24, 24, 24, 12, 36,
        36, 12, 48, 36, 24
    };
	
public static void getRefrigeratorDetails()
{
for(int index=0;index<RefrigeratorPrice.length;index++)
{
System.out.println("Refrigerator Price:"+RefrigeratorPrice[index]);
System.out.println("Refrigerator Size:"+RefrigeratorScreenSize[index]);
System.out.println("Refrigerator Brand:"+RefrigeratorBrandName[index]);
System.out.println("Refrigerator Warranty Months:"+RefrigeratorWarrantyMonths[index]);
System.out.println("-----------------------------------");
}
}
}