class Zomato{

public static String validateAndOrder(long mobileNumber,String foodName,String hotelName,String address,String userName){

System.out.println("validateAndOrder method is started");

String orderStatus=null;

if(mobileNumber!=0 && foodName!=null && hotelName!=null && address!=null && userName!=null){

    if(foodName.length()>3 && hotelName.length()>3 && userName.length()>3){

        orderStatus="Hello "+userName+" Your food "+foodName+" from "+hotelName+" is ordered successfully";

    }else{

        orderStatus="Please check the length of Food Name, Hotel Name or User Name";

    }

}else{

    orderStatus="Please enter the valid data";

}

System.out.println("validateAndOrder method is Ended");

return orderStatus;
}
public static boolean validateRegisterFields(long mobileNumber,String pasw,String fullName,String userName)
{
	System.out.println("validateRegisterFields is started");
	boolean isValidate=false;
	if (mobileNumber!=0)
	{
		isValidate=true;
	}
	if(pasw!=null)
	{
		isValidate=true;
	}
	if(fullName!=null)
	{
		isValidate=true;
	}
	if(userName!=null)
	{
		isValidate=true;
	}
	System.out.println("validateRegisterFields is started");
	return isValidate;
}
}