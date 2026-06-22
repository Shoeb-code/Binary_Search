package Binary_search;

public class findMinimumInSortedArray_153 {
    public static void main(String[] args) {
        int [] rotatedArray={4,5,6,7,0,1,2};
        int ans = findMin(rotatedArray);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int n=nums.length;

        int l=0; int r=n-1;
        while(l<r){
            int mid= l+ (r-l)/2;

            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return nums[r];
    }
}
