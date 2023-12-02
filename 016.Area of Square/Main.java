import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides of Square");
        int Sides = sc.nextInt();
        int area = Sides * Sides;
        System.out.println("Area of Square having Sides "+ Sides + "  is "+ area);
    }
}