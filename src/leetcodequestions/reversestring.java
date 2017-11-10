package leetcodequestions;

public class reversestring {
	String s="whatever";
	StringBuffer sb = new StringBuffer();
	char rev;
	String display(){

		for (int i = s.length()-1; i >=0; i--) {
			rev = s.charAt(i);
			sb.append(rev);
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		

	}

}
