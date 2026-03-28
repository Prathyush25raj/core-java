class MotoroloEdge60FusionRunner {

    public static void main(String[] args) {
        
        MotoroloEdge60Fusion.refInt = 30045;
        MotoroloEdge60Fusion.refFloat = 350.54f;       
        MotoroloEdge60Fusion.refByte = 30;             
        MotoroloEdge60Fusion.refDouble = 40.6780000;
        MotoroloEdge60Fusion.refLong = 759989321l;
                  

        System.out.println("Int value : " + MotoroloEdge60Fusion.refInt);
        System.out.println("Byte : " + MotoroloEdge60Fusion.refByte);
        System.out.println("Long : " + MotoroloEdge60Fusion.refLong);
        System.out.println("Float : " + MotoroloEdge60Fusion.refFloat);
        System.out.println("Double : " + MotoroloEdge60Fusion.refDouble);
    }
}