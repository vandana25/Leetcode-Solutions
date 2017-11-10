package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {
	static int rem=0;
	static int count=0;
	static int bigger=0;
	static int[] array= {1,5,10,50,100,500,1000};
	static Character[] roman= {'I','V','X','L','C','D','M'};
	static List list= new ArrayList();
	   public static String intToRoman(int num) {
	        
	        while(num>1){
	            rem=num%10;
	            num=num/10;
	            cal(num);
	        }
			return null;
	   }
	        public static void cal(int num){
	            for(int i =0;i<=array.length;i++){
	                if(num<=array[i]){
	                    if(i==0|| i==2 || i==4 ||i==6){
	                        int j=3;
	                        while(j==0){
	                            if(num>=count){
	                               count=+array[i];
	                                j--;
	                            }
	                        }
	                        if(count<num){
	                          bigger = array[i+1];
	                                                         
	                        }
	                    }
	                    else{
	                       count=array[i]; 
	                       list.add(roman[i]);
	                        if(count<num){
	                            int j=3;
	                            while(count<=num){
	                                 count=+array[i];
	                                j--;
	                            }
	                        }
	                        if(count==num ){
	                        	list.add(roman[i]);
	                        }
	                    }
	                }
	            }
	        }
	    
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(10);
		list.add(1,1);
		list.add(3,3);
		list.add(7,5);
	//	for(int i =0;i<list.size();i++){
	//		System.out.println(list.get(i));
	//	}
		System.out.println("hi");
	//	System.out.println(list.size());
	}

}
