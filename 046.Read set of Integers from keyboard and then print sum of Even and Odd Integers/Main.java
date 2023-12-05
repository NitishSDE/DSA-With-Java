import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Integers");
        int n = sc.nextInt();
        int[] numArray = new int[n];
        for(int i = 0; i<n; i++){
            numArray[i] = sc.nextInt();
        }
        System.out.println("Printing all Numbers you have Entered");
        for (int i : numArray) {
            System.out.print(i +" ");
        }
        System.out.println();
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i<numArray.length; i++){
            if(numArray[i] % 2 == 0){
                evenSum = evenSum + numArray[i];
            }else{
                oddSum = oddSum +numArray[i];
            }
        }
        System.out.println("EvenSum: "+evenSum);
        System.out.println("OddSum: "+oddSum);
      
    }
}