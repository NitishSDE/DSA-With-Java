public class Main {
    
    public static double findAverage(double a, double b, double c){
        double average = (a + b + c)/3;
        return average;
    }

    public static void main(String[] args) {
        System.out.println("Average of Three Number is "+findAverage(12.87, 34.89, 34.897));
    }
}