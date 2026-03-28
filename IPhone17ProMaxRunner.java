class IPhone17ProMaxRunner {

    public static void main(String[] args) {
        
        IPhone17ProMax.refInt = 12345;
        IPhone17ProMax.refFloat = 453.54f;       
        IPhone17ProMax.refByte = 44;             
        IPhone17ProMax.refDouble = 45.6780000;
        IPhone17ProMax.refLong = 7564894321L;
        IPhone17ProMax.refBoolean = true;
        IPhone17ProMax.refString = "iphone";     
        IPhone17ProMax.refChar = '5';            

        
        System.out.println("Int value : " + IPhone17ProMax.refInt);
        System.out.println("Byte : " + IPhone17ProMax.refByte);
        System.out.println("Short : " + IPhone17ProMax.refShort);
        System.out.println("Float : " + IPhone17ProMax.refFloat);
        System.out.println("Double : " + IPhone17ProMax.refDouble);
        System.out.println("Long : " + IPhone17ProMax.refLong);
        System.out.println("Boolean : " + IPhone17ProMax.refBoolean);
        System.out.println("String : " + IPhone17ProMax.refString);
        System.out.println("Char : " + IPhone17ProMax.refChar);
    }
}