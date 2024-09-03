public class Binary_Searh{
    public static int bsearch(int[]arr, int target){
        int start =0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1; // if nothing is returned from the while loop.
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,13,23};
        System.out.println(bsearch(arr,6));
    }
}