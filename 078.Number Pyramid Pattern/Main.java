public class Main {

    public static void number_pyramid(int n){
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        number_pyramid(5);
        number_pyramid(7);
    }
}