package leetcodequestions;

public class hammingcode {
	int i =4;
	int j = 3;
	String s = Integer.toBinaryString(i);
	String s2 = Integer.toBinaryString(j);

    void appendingstrings(){
    	System.out.println(s);
    	System.out.println(s2);
    	StringBuffer sb = new StringBuffer();
    	int count=0;
    	
    	if (s.length()>s2.length()) {
			int diff = s.length()-s2.length();
			for (int i = 0; i < diff; i++) {
				sb.append("0");
			}
			sb.append(s2);
			
			for (int i = 0; i < s.length(); i++) {
				if(!(s.charAt(i)==sb.charAt(i))){
					count++;
				}
			}
		}
    	
    	if (s.length()<s2.length()) {
			int diff = s2.length()-s.length();
			for (int i = 0; i < diff; i++) {
				sb.append("0");
			}
			sb.append(s);
			for (int i = 0; i < s2.length(); i++) {
				if(!(s2.charAt(i)==sb.charAt(i))){
					count++;
				}
			}
		}
    	
    	if(s.length()==s2.length()){
			for (int i = 0; i < s2.length(); i++) {
				if(!(s2.charAt(i)==s.charAt(i))){
					count++;
				}
			}	
    	}
    	System.out.println(count);
    } 
    

  
	
	public static void main(String[] args) {
		hammingcode hc = new hammingcode();
		hc.appendingstrings();
		 
		

	}

}
