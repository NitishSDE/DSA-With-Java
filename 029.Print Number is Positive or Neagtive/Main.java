import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter A Number");
      int a = sc.nextInt();
      if (a > 0) {
        System.out.println(a+ " is Positive");
      }
      else if(a < 0){
        System.out.println(a+ " is Neagtive");
      }
      else{
        System.out.println(a +" is Zero");
      } 
    }
}