class SamsungS25UltraRunner {

    public static void main(String[] args) {
        
        SamsungS25Ultra.refInt = 20045;
        SamsungS25Ultra.refFloat = 250.54f;       
        SamsungS25Ultra.refByte = 28;             
        SamsungS25Ultra.refDouble = 38.6780000;
        SamsungS25Ultra.refLong = 759989321l;
                  

        System.out.println("Int value : " + SamsungS25Ultra.refInt);
        System.out.println("Byte : " + SamsungS25Ultra.refByte);
        System.out.println("Long : " + SamsungS25Ultra.refLong);
        System.out.println("Float : " + SamsungS25Ultra.refFloat);
        System.out.println("Double : " + SamsungS25Ultra.refDouble);
    }
}