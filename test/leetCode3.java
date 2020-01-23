
class Solution {
    public int lengthOfLongestSubstring(String s) {

       Deque<Character> deq = new LinkedList<>();
       int max=0;
       
       for(int i =0; i<s.length();i++) {
    	   char check = s.charAt(i);
    	   
		   if(deq.contains(check)) {
			  int index = ((LinkedList)deq).indexOf(check);
			
                for(int j=0; j<=index; j++) {
                    deq.pollFirst(); 

                    if(max < deq.size()) {
                        max =  deq.size(); 
                    }
                }
               deq.addLast(check); 
               
		   }else {
                deq.addLast(check);
                
               if(max < deq.size()) {
                    max =  deq.size(); 
               }
		   }
		   
       }
       return max;
       
    }
}
