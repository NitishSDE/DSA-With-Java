public class Main {
    public static void changeValue(int a){
        a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int num1 = 10;
        changeValue(num1);
        System.out.println(num1);

    }
}