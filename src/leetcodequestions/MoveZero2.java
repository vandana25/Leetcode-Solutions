package leetcodequestions;

public class MoveZero2 {
int nums[]={1,0,3,5,0,0,0,10};
int count=0;
void display(){
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]!=0){
			nums[count]=nums[i];
			count++;
		}
	}
	while(count<nums.length){
		nums[count]=0;
		count++;
	}
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MoveZero2 m2 = new MoveZero2();
m2.display();
	}

}
