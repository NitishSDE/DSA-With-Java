public class Main {

    public static void diamond_pattern(int n){
        //Upper Half
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n; i>=1; i--){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_pattern(5);
    }
}