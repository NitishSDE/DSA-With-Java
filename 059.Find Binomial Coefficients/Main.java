public class Main {

    public static int findFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int findBinCoeff(int n, int r){
        int nFact = findFactorial(n);
        int rFact = findFactorial(r);
        int nmrFact = findFactorial(n-r);
        int binCoeff = nFact/(rFact*nmrFact);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(findBinCoeff(6, 2));
        
    }
}