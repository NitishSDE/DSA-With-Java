public class Main {

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10,12,15,18,20};
        int key = 10;
        int index = linearSearch(marks, key);

        if(index == -1){
            System.out.println("Number not Found");
        }
        else{
            System.out.println("Number is at index "+ index);
        }
    }
}