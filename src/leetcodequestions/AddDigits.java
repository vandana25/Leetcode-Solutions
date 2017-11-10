package leetcodequestions;

import java.util.ArrayList;

public class AddDigits {
int num=9251;
int temp=0;
int test=0;
int total;
int innertemp=0;
int display(){
	ArrayList<Integer> array = new ArrayList<Integer>();
	do{
	    array.add(num % 10);
	    num /= 10;
	} while  (num > 0);
	
	
	for (int i = array.size()-1; i >=0; i--) {
		test=0;
		int first = array.get(i);
		 temp = temp+first;
		 String s = String.valueOf(temp);
		 char[] digits = s.toCharArray();
		 for(char c: digits){
			 char d =c;
			 if(test==0){
					String firsts = String.valueOf(c);	
					
					innertemp=Integer.valueOf(firsts);
					test++;
				}
				else{
					String seconds=String.valueOf(c);
					
					total=innertemp+Integer.valueOf(seconds);
					temp=total;
					
				}
			}

		
	}
	System.out.println(temp);
	return temp;
}
	public static void main(String[] args) {
		AddDigits a = new AddDigits();
a.display();
	}

}
