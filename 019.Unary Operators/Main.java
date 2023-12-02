public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int c = 13;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = e--;
        System.out.println(e);
        System.out.println(f);

        int g = 13;
        int h = --g;
        System.out.println(g);
        System.out.println(h);
    }
}