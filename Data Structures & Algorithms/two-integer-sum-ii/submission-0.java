class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lt=0;
        int rt=numbers.length-1;
        int sum;
        int[] arr=new int[2];
        while(lt<rt){
        sum=numbers[lt]+numbers[rt];
        if(sum==target){
        return new int[]{lt+1,rt+1};
        }
        else if(sum>target){
            rt--;
        }
        else{
            lt++;
        
        }
        }
        return arr;
    }
}
