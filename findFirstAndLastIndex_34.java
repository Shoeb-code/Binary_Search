package Binary_search;

public class findFirstAndLastIndex_34 {
    public static void main(String[] args) {

        int [] nums={5,7,7,8,8,10};
        int target=8;

        int [] ans = searchRange(nums,target);
        System.out.println(ans[0] + "  " +  ans[1]);

    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;

        int [] ans = new int [2];
        ans[0]=findFirstIndex(n,nums,target);
        ans[1]=findLastIndex(n,nums,target);

        return ans;
    }
    public static int  findFirstIndex(int n, int [] nums, int target){

        int l=0;
        int r=n-1;
        int firstIndex=-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                firstIndex=mid;
                r=mid-1;
            }
            else if(nums[mid]<target) l=mid+1;

            else{
                r=mid-1;
            }

        }
        return firstIndex;
    }

    public static int  findLastIndex(int n, int [] nums, int target){

        int l=0;
        int r=n-1;
        int lastIndex=-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                lastIndex=mid;
                l=mid+1;
            }
            else if(nums[mid]<target) l=mid+1;

            else{
                r=mid-1;
            }

        }
        return lastIndex;
    }
}
