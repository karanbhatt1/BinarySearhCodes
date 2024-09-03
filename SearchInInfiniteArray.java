public class SearchInInfiniteArray {
    private static int result(int []arr,int target){
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        // it should be less than the nums[end];
        while(target>arr[end]){
           int  temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        int res = bS(arr,start,end,target);
        return res;
    }
    public static void main(String[] args){
        int[]nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int s = result(nums,13);
        System.out.println(s);


    }
    private static int bS(int []arr,int start,int end,int target){
        int mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
