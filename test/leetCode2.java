
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        list1.add(l1.val);
        list2.add(l2.val);
        
        sb1.append(Integer.toString(l1.val));
        sb2.append(Integer.toString(l2.val));
        
        while(l1.next !=null){
            l1 = l1.next;
            sb1.append(Integer.toString(l1.val));
        }
        while(l2.next != null){
            l2 = l2.next;
            sb2.append(Integer.toString(l2.val));
        }
        
        String value =  sb1.reverse().toString();
		String value2 = sb2.reverse().toString();
		
		int length= value.length();
		int length2= value2.length();
		
		int maxlength = (length > length2)? length: length2;
        
		boolean flag = false;
		ArrayList<Integer> list = new ArrayList<>();
		
         if(length != maxlength){
            int bufferNum = maxlength- length;
            String buffer ="";
            
            for(int i=0; i<bufferNum; i++){
                buffer+="0";            
            }
            sb1.insert(0,buffer);

         }
        if(length2 != maxlength){
            int bufferNum = maxlength- length2;
            String buffer ="";
            
            for(int i=0; i<bufferNum; i++){
                buffer+="0";            
            }
            sb2.insert(0,buffer);
        }
        
		for (int i = maxlength-1; i >= 0 ; i--) {
			int sum = 0;
			int part=0,part2=0;
			
            part =  sb1.toString().charAt(i)-'0';	
            part2 = sb2.toString().charAt(i)-'0';	
            
            sum = part+part2;
			
			if(flag) {
                sum +=1;
                flag = false;
			}
            
			if(sum >= 10) {
				list.add(sum-10);
				flag = true;
			}else {
				list.add(sum);
			}
		}
        
        if(flag) {
			list.add(1);
		}
        
        ListNode[] node = new ListNode[list.size()];

        for (int i = 0; i<list.size() ; i++) {
            node[i] = new ListNode(list.get(i));
		}
        
        for (int i = 0; i<list.size() ; i++) {
            if(i != list.size()-1){
                node[i].next = node[i+1];  
            }
        }
        return node[0];
    }
}

