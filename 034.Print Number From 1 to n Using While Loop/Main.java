import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter The Value of n"); 
      int n = sc.nextInt();
      int counter = 1;
      while (counter <= n) {
        System.out.print(counter+",");
        counter++;
      }

    }
}