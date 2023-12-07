public class Main1 {

    public static void updateMarks(int a[], int b){
        for(int i=0; i<a.length; i++){
            a[i] = a[i]+5;
        }
        b = b + 5;
    }

    public static void main(String[] args) {
        int marks[] = {87, 76, 68};
        for (int i : marks) {
            System.out.print(i+",");
        }
        System.out.println();
        int num = 15; // This Number will Unchanged
        System.out.println(num);
        updateMarks(marks,num);
        System.out.println();
        for (int i : marks) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(num);
    }
}