package leetcodequestions;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class question1 {
	int a[]={1,3,15,16,17};
	int b[]={2,3,9,13,19,21,31};
int first=0;
	int second=0;
	ArrayList list =new ArrayList();
void display(){
	if(b.length>a.length){
		while(second<b.length){
			if(first==(a.length)){
				list.add(b[second]);
				second++;
			}
			else if(a[first]==b[second]){
				list.add(b[second]);
				list.add(a[first]);
				second++;
				first++;
				
			}
			else if(a[first]>b[second]){
				list.add(b[second]);
				second++;
			}
			else{
				list.add(a[first]);
				first++;
			}	
		}
	}
	else{
		while(first<a.length){
			if(second==(b.length)){
				list.add(a[first]);
				first++;
			}
			else if(a[first]==b[second]){
				list.add(b[second]);
				list.add(a[first]);
				second++;
				first++;
				
			}
			else if(a[first]>b[second]){
				list.add(b[second]);
				second++;
			}
			else{
				list.add(a[first]);
				first++;
			}	
		}
	}

	
	int[] array = new int[list.size()];
	for(int i = 0; i < list.size(); i++){
		array[i] = (int) list.get(i);
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
question1 q= new question1();
q.display();
	}

}
