import java.util.*;
public class Main {

    public static boolean isEven(int n){
        if(n %2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println(n +" is an Even Number");
        }
        else{
            System.out.println(n + " is an Odd Number");
        }
    }
}