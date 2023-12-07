public class Main {

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,2,1,8,9,5,4,10,12,11,9};
        System.out.println("Smallest element is : "+ getSmallest(numbers));
    }
}