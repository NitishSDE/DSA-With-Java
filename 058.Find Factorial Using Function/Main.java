public class Main {

    public static int findFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a = 6;
        System.out.println("Factorail of "+a+" is "+findFactorial(a));
    }
}