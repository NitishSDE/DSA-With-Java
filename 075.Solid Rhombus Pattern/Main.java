public class Main {

    public static void solid_rhombus_pattern(int n){
        for(int i=1; i<=n; i++){
            //Spaces Printing
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Star Printing
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombus_pattern(5);
        solid_rhombus_pattern(8);
    }
}