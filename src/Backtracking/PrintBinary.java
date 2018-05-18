package Backtracking;

public class PrintBinary {
	public static void print(int digits){
		helper(digits,"");
	}
	public static void helper(int digits,String prefix ){
		if(digits==0){
			System.out.println(prefix);
		}
		else{
			helper(digits-1, prefix+"0");
			helper(digits-1, prefix+"1");
		}
		
	}

	public static void main(String[] args) {
		print(2);
	}

}
