import java.util.ArrayList;

public class OrderAgnosticBSearch {
    public static int orderagnosticbsearch(int[] arr , int target){
        boolean isasc = arr[0]<arr[arr.length-1];
        int start =0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums={10,9,7,5,2,1};
        int[] nums2 = {1,3,4,56,355,899};
//        System.out.println(orderagnosticbsearch(nums2,355));
        int a=10;
        int b=20;
        int[] arr ={a,b};
    }
}
