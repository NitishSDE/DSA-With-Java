public class Main {

    public static void printHollowRectangle(int totRow, int totalCol){
        // Outer Loop
        for(int i=1; i<=totRow; i++){
            // Inner Loop
            for(int j=1; j<=totalCol; j++){
                if(i==1 || i==totRow || j==1 || j==totalCol){
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
        printHollowRectangle(4, 4);
        printHollowRectangle(6, 4);
        printHollowRectangle(10, 5);
    }
}