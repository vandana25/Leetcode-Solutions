package leetcodequestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class AssignCookies {
int greed[]={1,2,3};
int size[]={1,2};
int assign=0;
int a=-1;
int b=-1;

List<Integer> list = new ArrayList<>();
List<Integer> listsize = new ArrayList<>();

void display(){
	for (int i = 0; i < greed.length; i++) {
		list.add(greed[i]);
	}
	for (int i = 0; i < size.length; i++) {
		listsize.add(size[i]);
	}
	Iterator i = list.iterator();
	
	Iterator j = listsize.iterator();
	while (i.hasNext())
	  {
		a++;
		while(j.hasNext()){
			b++;
			if(list.get(a)==listsize.get(b)){
				 int name = (int) i.next();
				 int name2 = (int) j.next();
				i.remove();
				j.remove();
				assign++;
				a--;
				b--;
				System.out.println(listsize);
				System.out.println(list);
				System.out.println(j.toString());
				break;
			}
		}
	   
	  }

}
	public static void main(String[] args) {
		AssignCookies a = new AssignCookies();
		a.display();
	}

}
