package leetcodequestions;
import java.util.Scanner;
public class Ana {
	public static void sort()
	{
		int s=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the set of values");
		for (int i=0;i<5;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println("sorted array is : /n" +a[i]);
		}
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<(5-i);j++)
			{
			if(a[j-1]>a[j])
			{
				s=a[j-1];
				a[j-1]=a[j];
				a[j]=s;
			}	
			}
		}
		System.out.println("hello");
		for(int i=0;i<5;i++){
			System.out.println("sorted array is : /n" +a[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	sort();
	
	
	

	}
	
	

}

