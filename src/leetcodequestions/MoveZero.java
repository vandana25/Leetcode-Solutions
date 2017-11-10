package leetcodequestions;

import java.util.Arrays;

public class MoveZero {
int arr[]={0,1,0,30,0,0,012};
int count=0;
void dis(){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]==0){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=0;
				}
			}
	}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MoveZero m = new MoveZero();
m.dis();
	}

}
