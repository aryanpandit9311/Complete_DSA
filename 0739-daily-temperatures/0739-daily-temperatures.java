class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int newarr[] = new int[arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1 && arr.length>0){
                stack.push(i);
                newarr[i]=0;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()]<= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    newarr[i]=0;
                }else{
                    newarr[i]=stack.peek() - i;
                }
                 stack.push(i);
            }
           

        }
        return newarr;
    }
}