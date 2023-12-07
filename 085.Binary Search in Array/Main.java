public class Main {

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;
        int mid = (start+end)/2;
        for(int i=0; i<numbers.length; i++){
            while (start <= end) {
                if (key == numbers[mid]) {
                    return mid;
                }
                else if(key > numbers[mid]){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
        }

        }
        return -1;
        

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,15,18,20};
        int key = 10;
        int index = binarySearch(numbers, key);

        if(index == -1){
            System.out.println("Number not Found");
        }
        else{
            System.out.println("Number is at index "+ index);
        }
    }
}