public class Main {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,2,1,8,9,5,4,10,12,11,9};
        System.out.println("Largest element is : "+ getLargest(numbers));
    }
}