/*
Function Overloading-Multiple Function with same name but differnet parameters.
Different parameters can be acheived by using two ways
    -> By Using Different number of Parameters.
    -> By Same number of parameters, but differnet data types.
 */



public class Main {
    // Function Overloading Using number of Parameters.
    public static int findSum(int a, int b){
        return a + b;
    }
    public static int findSum(int a, int b, int c){
        return a + b + c;
    }
    public static int findSum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(findSum(12, 78));
        System.out.println(findSum(2, 4, 6));
        System.out.println(findSum(12, 8, 34, 66));
    }
}