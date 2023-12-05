import java.util.*;
public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Value of n"); 
     int n = sc.nextInt();
     int sum = 0;
     int counter = 1;
     while (counter <= n) {
        sum = sum +counter;
        counter++;
     }
     System.out.println("Sum of First "+ n + " Natutal Number is "+ sum);  
    }
}