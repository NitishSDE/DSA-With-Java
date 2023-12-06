public class Main {

    public static boolean checkPalindrom(int n){
        int originalNum = n;
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n%10;
            revNum = revNum*10 + lastDigit;
            n = n/10;
        }
        if (revNum == originalNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrom(121));
        System.out.println(checkPalindrom(123));
    }
}