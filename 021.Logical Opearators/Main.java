public class Main {

    public static void main(String[] args) {
        boolean bool1 = (68 > 45); // true
        boolean bool2 = (34 < 29); //false

        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println(!(bool1));
        System.out.println(!(bool2));

        System.out.println(true && true);  //true
        System.out.println(true && false); //false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        System.out.println(true || true); //true
        System.out.println(true || false); // true
        System.out.println(false || true); //false
        System.out.println(false || false); //false



    }
}