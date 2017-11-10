package leetcodequestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Intersaction {
	int[] nums1={1,2,1,2};
	int[] nums2={2,2};
	 int[] output;
	 
	 Set<Integer> set = new HashSet<>();
     HashMap<Integer, Integer> hm = new HashMap<>();
     void dis(){
         for(int i=0;i<nums1.length;i++){
 			if(hm.containsKey(nums1[i])){
         int count= hm.get(nums1[i]);
         count++;
         hm.put(nums1[i],count);
     }
     else{
         hm.put(nums1[i],1);
     }
 }
 for(int i =0; i<nums2.length;i++){
     if(hm.containsKey(nums2[i])){
    	 
    	         set.add(nums2[i]);
    	     
    	 } 
     }
     
 
 
 int i = 0;
 output = new int[set.size()];
 for (Integer num : set) {
     output[i++] = num;
 }

 for (int j = 0; j <= output.length-1; j++) {
	 System.out.println(output[j]);
}

     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Intersaction i = new Intersaction();
i.dis();
	}

}
