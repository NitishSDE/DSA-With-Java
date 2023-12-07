public class Main {

    public static void hollow_rhombus_pattern(int n){
        for(int i=1; i<=n; i++){
            //Spaces Printing
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Hollow Rectangle Printing
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus_pattern(5);
        hollow_rhombus_pattern(12);
    }
}