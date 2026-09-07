class Solution {
    public int[] sortedSquares(int[] arr) {
  int n=arr.length;
  int ans[] = new int[arr.length];
  int left = 0;
  int right = n-1;
  int index=n-1;

  while(left<=right){
    int l = arr[left]*arr[left];
    int r= arr[right]*arr[right];
    if(r>l){
        ans[index]=r;
        right--;
        index--;
    }else{
        ans[index]=l;
        left++;
        index--;
    }
  }
  return ans;

    }
}