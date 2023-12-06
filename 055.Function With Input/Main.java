import java.util.*;
public class Main {
    public static void getSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of "+ a + " and "+ b +" is "+sum);
    }

    public static int calcultaeSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        getSum(12, 23);
        System.out.println("Enter Two Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of "+ a + " and "+ b +" is "+calcultaeSum(a, b));
    }
}