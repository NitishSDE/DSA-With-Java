public class Main {

    public static void butterfly_pattern(int n){
        // First Half
        for(int i=1; i<=n; i++){
            //First Part Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //Last Part Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for(int i=n; i>=1; i--){
            //First Part Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //Last Part Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(5);
        butterfly_pattern(12);
    }
}