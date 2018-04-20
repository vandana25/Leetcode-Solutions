package leetcodequestions;

public class UniqueCharacters {
public static boolean findUniqueCharacter(String str){
	int checker=0;
	for(int i=0;i<str.length();i++){
		int value = str.charAt(i)-'a';
		int val = 1<<value;
		if((checker & (1<<value))>0)
		return false;
		checker= checker | (1<<value);
	}
	
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			findUniqueCharacter("check");
	}

}
