package leetcodequestions;


public class Anagram {
	String s="aa";
	String t="aa";
	int sascii=0;
	int tascii=0;
	char ret;
	Boolean flag=false;
	void display(){
		System.out.println("hello");
		for (int i = 0; i < s.length(); i++) {
			int newnum=(int)s.charAt(i);
			sascii=sascii+newnum;
		}
		for (int i = 0; i < t.length(); i++) {
			int newtnum = (int)t.charAt(i);
			tascii=tascii+newtnum;
		}
		ret =(char)(sascii - tascii);
		if(ret == ' '){
			flag=true;
		}
		System.out.println(flag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Anagram a =new Anagram();
a.display();
System.out.println("hi");
	}

}
