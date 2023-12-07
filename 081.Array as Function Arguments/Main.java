public class Main {

    public static void updateMarks(int a[]){
        for(int i=0; i<a.length; i++){
            a[i] = a[i]+5;
        }
    }

    public static void main(String[] args) {
        int marks[] = {87, 76, 68};
        for (int i : marks) {
            System.out.print(i+",");
        }
        updateMarks(marks);
        System.out.println();
        for (int i : marks) {
            System.out.print(i+",");
        }
        System.out.println();
    }
}