public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 9};
        System.out.println(IsSearch(arr, 18, 0));
        System.out.println(FindIndex(arr, 18, 0));
        System.out.println(FindLastIndex(arr, 9, arr.length-1));
    }

    static boolean IsSearch(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return false;
        }
        return arr[i] == target || IsSearch(arr, target, i + 1);
    }

    static int FindIndex(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
          return  FindIndex(arr, target, i + 1);
        }
    }

    static int FindLastIndex(int[] arr, int target, int i){
        if(i==-1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        } else{
            return FindLastIndex(arr, target, i-1);
        }
    }
}
