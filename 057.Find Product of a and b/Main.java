public class Main {
    public static int findProduct(int a, int b){
        int prod = a*b;
        return prod;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int product = findProduct(a, b);
        System.out.println(a+"x"+b+"="+findProduct(a,b));
    }
}