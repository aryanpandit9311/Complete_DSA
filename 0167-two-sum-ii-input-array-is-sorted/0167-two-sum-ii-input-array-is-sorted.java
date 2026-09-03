class Solution {
    public int[] twoSum(int[] arr, int target) {
       int left=0;
       int right=arr.length-1;
      while(right>left){
        if(arr[left]+arr[right]>target){
            right--;
        }else if(arr[left]+arr[right]<target ){
            left++;
        }else if(arr[left]+arr[right]==target){
            return new int []{left+1, right+1};
        }
       }
       return new int[]{};
    }
}