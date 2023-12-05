public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            if (i == 50) {
                break; // It only prints number upto 50.
            }
        }
        System.out.println("Out of the for loop");
    }
}