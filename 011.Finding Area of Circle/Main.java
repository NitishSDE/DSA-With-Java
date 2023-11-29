import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of Circle having "+ rad + " is "+ area);
    }
}