package leetcodequestions;

public class sumoftwo {
	int a=-5;
	int b=3;
	static int count=0;
	void display(){
		if(a>0){
			for (int i = 0; i < a; i++) {
				count++;
			}
		}
		else{
			for (int i = 0; i > a; i--) {
				count--;
			}
		}
		
		if(b>0){
			for (int i = 0; i < b; i++) {
				count++;
			}
		}
		else{
			for (int i = 0; i > b; i--) {
				count--;
			}
		}
	System.out.println(count);
	
	}
	
	public static void main(String[] args) {
		sumoftwo s = new sumoftwo();
		s.display();
	}	

}
