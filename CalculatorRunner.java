public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(7));
        System.out.println(calc.add(15));

        System.out.println(calc.add(5,8));
        System.out.println(calc.add(12,9));

        System.out.println(calc.add(2,4,6));
        System.out.println(calc.add(3,6,9));

        System.out.println(calc.add(2,4,6,8));
        System.out.println(calc.add(1,3,5,7));

        System.out.println(calc.add(2,4,6,8,10));
        System.out.println(calc.add(10,8,6,4,2));

        System.out.println(calc.add(3,6,9,12,15,18));
        System.out.println(calc.add(18,15,12,9,6,3));

        System.out.println(calc.add(1,3,5,7,9,11,13));
        System.out.println(calc.add(13,11,9,7,5,3,1));

        System.out.println(calc.add(2,4,6,8,10,12,14,16));
        System.out.println(calc.add(16,14,12,10,8,6,4,2));

        System.out.println(calc.add(1,2,4,8,16,32,64,128,256));
        System.out.println(calc.add(256,128,64,32,16,8,4,2,1));

        System.out.println(calc.add(5,10,15,20,25,30,35,40,45,50));
        System.out.println(calc.add(50,45,40,35,30,25,20,15,10,5));

        
        System.out.println(calc.sub(50,20));
        System.out.println(calc.sub(100,40));

        System.out.println(calc.sub(60,20,10));
        System.out.println(calc.sub(90,30,15));

        
        System.out.println(calc.mul(3,7));
        System.out.println(calc.mul(6,8));

        System.out.println(calc.mul(2,5,7));
        System.out.println(calc.mul(4,6,8));
    }
}