package leetcodequestions;

public class stringLength {
	public static int countSegments(String s) {
		 int count=0;
        String str=s.trim();
        if(str.length()==1)
        	count=1;
        else{
        	  for(int i =0;i<str.length();i++){
                  if(Character.isWhitespace(str.charAt(i))){
                      for(int j=i+1;j<str.length();j++){
                           if(!" ".equals(str.charAt(j))){
                                count++;
                                i=j;
                                break;
                           } 
                      }
                  }
                 
              }
        }
      
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s = "Hello, my name is John";
 System.out.println(countSegments(s));
	}

}
