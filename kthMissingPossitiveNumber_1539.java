package Binary_search;

public class kthMissingPossitiveNumber_1539 {
    public static void main(String[] args) {
         int [] arr ={2,3,4,7,11};
         int k=5;
         int ans = findKthPositive(arr,k);
    }
    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int l=0 , r=n-1;

        while(l<=r){
            int mid= l+( r-l)/2;

            int missing_number=arr[mid]-(mid+1);
            if(missing_number < k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l+k;

    }
}
