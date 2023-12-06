public class Main1 {

    public static void swapTwoNumber(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping First Number: "+a+" Second Number: "+b);

    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swapTwoNumber(num1, num2);
        // After Calling Function Actual value is not changed.
        System.out.println("First Number: "+num1 +" Second Number: "+num2);
        
    }
}