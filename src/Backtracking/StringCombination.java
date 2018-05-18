package Backtracking;

public class StringCombination {

	public static void permutation(String s){
		helper(s, "");
	}
	public static void helper(String s, String choosen){
		if(s.length() == 0) System.out.println(choosen);
//		System.out.println(s+"  "+choosen);
		for(int i=0;i<s.length();i++){
			//choose
			char c = s.charAt(i);
			choosen+=Character.toString(c); 
			s = s.substring(0,i) + s.substring(i+1,s.length());
			
			
			//explore
			helper(s, choosen);
			//unchoose
			
			choosen =choosen.substring(0,choosen.length()-1);
			s = s.substring(0,i)+c+s.substring(i,s.length());
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("van");
	}

}
