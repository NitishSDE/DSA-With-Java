import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number"); 
        int num = sc.nextInt();
        boolean flag = true;
        if (num ==1 ) {
            flag = false;
        }else{
            for(int i=2; i<Math.sqrt(num); i++){
            if(num%i == 0){
                flag = false;
            }
            else{
                flag = true;
            }
        }
        }
        if(flag){
            System.out.println(num +" is a Prime Number");
        }
        else{
            System.out.println(num +" is not a Prime Number");
        }

    }
}