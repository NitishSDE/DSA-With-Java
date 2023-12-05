public class Main {

    public static void main(String[] args) {
        int num = 167589;
        int reverseNumber = 0;
        while (num > 0) {
            int lastDigit = num%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            num = num/10;
        }
        System.out.println(reverseNumber);
    }
}