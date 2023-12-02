import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost of Three item");
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        
        float total = item1 + item2 + item3;
        float totalBill = total*1.18f;
        System.out.println("Total Bill with 18 % Tax is "+ totalBill);
        
    }
}