public class Main {

    public static int binaryToDecimal(int n){
        double decimal = 0;
        int power = 0;
        while (n > 0) {
            int lastDigit = n%10;
            decimal = decimal + lastDigit*(Math.pow(2, power));
            power++;
            n = n/10;

        }
        return (int)decimal;
    }

    public static void main(String[] args) {
        int binNum = 101;
        System.out.println("Decimal of Binary Number "+ binNum+ " is "+binaryToDecimal(binNum));
    }
}