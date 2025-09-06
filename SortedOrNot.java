public class SortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,8,4,5};
        System.out.println(IsSorted(arr,0));
    }

    static boolean IsSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && IsSorted(arr,i+1);
    }
}
