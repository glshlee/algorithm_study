class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        boolean flag = false;
        
        ArrayList<Integer> list = new ArrayList<>();
        int bb[] = new int[2];
        
        for(int i =0; i<nums.length; i++){
            if(flag == true){
                break;
            }
            sum =0;
            sum += nums[i];
            for(int j =i+1; j< nums.length  ;j++){
                sum += nums[j];                
                if(sum == target){
                    list.add(i);
                    list.add(j);
                    flag = true;
                    break;
                }else{
                    sum -= nums[j];
                }
            }
        }
        for(int i=0; i<2; i++){
            bb[i] = list.get(i);
        }
        return bb;
    }
}
