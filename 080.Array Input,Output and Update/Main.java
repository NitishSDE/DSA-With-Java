import java.util.*;
public class Main {

    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks");
        marks[0] = sc.nextInt();

        System.out.println("Enter Chemistry Marks");
        marks[1] = sc.nextInt();

        System.out.println("Enter Maths Marks");
        marks[2] = sc.nextInt();

        System.out.println("Physics Mark: "+ marks[0]);
        System.out.println("Chemistry Mark: "+ marks[1]);
        System.out.println("Maths Mark: "+ marks[2]);

        System.out.println("Length of Array is "+ marks.length);
    }
}