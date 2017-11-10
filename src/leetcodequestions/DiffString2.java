package leetcodequestions;

public class DiffString2 {
String s = "ac";
String t = "bbe";
char ret;
int k=0;
char display(){
	
	  int charCodeS = 0, charCodeT = 0;
      // Iterate through both strings and char codes
      for (int i = 0; i < s.length(); ++i) 
    	  charCodeS += (int)s.charAt(i);
      for (int i = 0; i < t.length(); ++i) 
    	  charCodeT += (int)t.charAt(i);
      // Return the difference between 2 strings as char
      ret =(char)(charCodeT - charCodeS);
      System.out.println(ret);
      return (char)(charCodeT - charCodeS);
	

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DiffString2 d = new DiffString2();
d.display();
	}

}
