public class Main {

    public static int decimalToBinary(int n){
        double binNum = 0;
        int power = 0;
        while (n >0) {
           int lastDigit = n%2;
           binNum = binNum + lastDigit*(Math.pow(10, power));
           power++;
           n = n/2;

        }
        return (int)binNum;
    }

    public static void main(String[] args) {
        int decNum = 7;
        System.out.println("Binary of Decimal Number "+ decNum+ " is "+decimalToBinary(decNum));
    }
}