/*
 Type Promotion in expression

 1.Java automatically promotes each byte, short or char opernad to int while evaluating expression.

 2.If one operand is long, float or double then whole expression is promoted to long, float and double respectively.

 */
public class Main {

    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'a';
        System.out.println((int)ch1);
        System.out.println((int)ch2);
        System.out.println(ch2 - ch1);

        int a = 35;
        float b = 34.78f;
        long c = 234567898l;
        double d = 23.67;
        double sum = a + b + c + d;
        System.out.println(sum);

    }
}