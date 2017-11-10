package leetcodequestions;

public class Binarybacktracking {
	//int digits=3;
	public static void print(int digits, String prefix){
		if(digits==1){
			System.out.println(prefix+"0");
			System.out.println(prefix+"1");
		}
		else {
		print(digits-1, prefix +"0");
		print(digits-1, prefix+"1");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3, "");
	}

}
