public class Main1 {

    // Function Overloading by Same number of parameters, but differnet data types

    public static int findSum(int a, int b){
        return a + b;
    }

    public static float findSum(float a, float b){
        return a + b;
    }

    public static double findSum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(findSum(12, 8));
        System.out.println(findSum(12f, 8f));
        System.out.println(findSum(12.0, 8.0));
    }
}