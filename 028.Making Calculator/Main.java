import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Two Number");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Enter Operation");
      char Operation = sc.next().charAt(0);

      switch (Operation) {
        case '+':
            System.out.println("Addition: "+ (a + b));
            break;
        case '-':
            System.out.println("Subtraction: "+ (a - b));
            break;
        case '*':
            System.out.println("Multiplication: "+ (a * b));
            break;
        case '/':
            System.out.println("Division: "+ (a / b));
            break;
        case '%':
            System.out.println("Remainder: "+ (a % b));
            break;
      
        default:
            break;
      }

    }
}