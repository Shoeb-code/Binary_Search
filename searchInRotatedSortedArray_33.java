package Binary_search;

public class searchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        int target = 1;
    int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        return  targetindex(nums,target);
    }
    public static int targetindex(int [] arr , int target){
        int peak = findpivot(arr);

        int idx=binary(arr, target, 0,peak -1);
        if(idx!=-1){
            return idx;
        }
        return binary(arr, target, peak, arr.length-1);

    }
    public static int binary(int [] arr , int target ,int start, int end ){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }
    public static int findpivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]<arr[end]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return end ;
    }
}
