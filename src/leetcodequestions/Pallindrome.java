package leetcodequestions;

public class Pallindrome {
	String s = "A man, a plan, a canal: Panama";
//	String s = "ab";
	String st="";
	Boolean flag=true;
	void display(){
		st=s.replaceAll("[^A-Za-z0-9]", "");
		String str=s.replaceAll("[^A-Za-z]", "");
		int i=0;
		int j =st.length()-1;
		while (j>i) {
			System.out.println("m here");
			if(Character.toLowerCase(st.charAt(i))!=Character.toLowerCase(st.charAt(j))){
				flag=false;
				break;
			}
			else{
				j--;
				i++;
			}
		}
		 System.out.println(flag);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pallindrome p = new Pallindrome();
p.display();
	}

}
