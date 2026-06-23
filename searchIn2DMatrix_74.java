package Binary_search;

public class searchIn2DMatrix_74 {
    public static void main(String[] args) {
        int [][] matrix = {{1 ,3 , 5, 7 },
                           {10,11,16,20},
                           {23,30,34,60} };
        int target =11;
        searchMatrix(matrix,target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        // return Staircase_Search(matrix,target);
        return  binarySearchMatrix(matrix,target);
    }
 // time complexity of this solution is O(log(m×n))
    public static boolean binarySearchMatrix(int [][] arr, int target){
        int m=arr.length;
        int n=arr[0].length;

        int l=0;
        int h=m*n-1;

        while(l<=h){
            int mid = l+ (h-l)/2;
            int row =mid/n;
            int col=mid%n;
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    // time complexity of this solution is O(m+n)
    public static boolean  Staircase_Search(int[][] arr, int item) {
        int row=0;
        int column =arr[0].length-1;

        while (column>=0 && row< arr.length){
            if (arr[row][column]==item){
                return true;
            }
            else if (arr[row][column]>item){
                column--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
