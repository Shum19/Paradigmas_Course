package Home_Task_6;

public class Search {
    public static int binarySearch(int value, int[] arr, int min, int max){
        int midpoint;
        if (max < min){
            return -1;
        }else {
            midpoint = (max-min) / 2 + min;
        }
        if (arr[midpoint] < value){
            return binarySearch(value, arr, midpoint + 1, max);
        }else {
            if (arr[midpoint] > value){
                return binarySearch(value, arr, min, midpoint - 1);
            }else return midpoint;
        }
    }
}
