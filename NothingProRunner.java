class NothingProRunner {

    public static void main(String[] args) {
        
        NothingPro.refInt = 20045;
        NothingPro.refFloat = 250.54f;       
        NothingPro.refByte = 28;             
        NothingPro.refDouble = 38.6780000;
        NothingPro.refLong = 759989321l;
                  

        System.out.println("Int value : " + NothingPro.refInt);
        System.out.println("Byte : " + NothingPro.refByte);
        System.out.println("Long : " + NothingPro.refLong);
        System.out.println("Float : " + NothingPro.refFloat);
        System.out.println("Double : " + NothingPro.refDouble);
    }
}