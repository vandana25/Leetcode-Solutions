package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
int n =16;
int count=0;

public List<String> display(){

	List<String> list = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		count++;
		if(count%3==0){
			if(count%15==0){
				list.add("FizzBuzz"); }
				else {
					list.add("Fizz");
				}
			}
		else if(count%5==0){
			if(count%15==0){
				list.add("FizzBuzz");}
				else {
					list.add("Buzz");
				}
			}
		else {
			String s= Integer.toString(count);
			list.add(s);
		}
		}

		
	
	return list;

	
}
	public static void main(String[] args) {
		FizzBuzz f = new FizzBuzz();
		f.display();

	}

}
