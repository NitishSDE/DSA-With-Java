public class Main {

    public static void main(String[] args) {
        int a = 65;
        int b = 89;
        int c = 36;
        if (a >= b && a >=c) {
            System.out.println("largest is a");
        }
        else if (b >= c) {
            System.out.println("largset is b");
        }
        else{
            System.out.println("largest is c");
        }
    }
}