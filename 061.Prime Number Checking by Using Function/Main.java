public class Main {

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        else{
            for(int i=2; i<=n-1; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(13));
        System.out.println(isPrime(4));
    }
}