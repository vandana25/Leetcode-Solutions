package leetcodequestions;

public class ClosetPalindrome {
	 public static String nearestPalindromic(String n) {
	        int length=n.length();
	        StringBuilder reversesb = new StringBuilder();
	        reversesb.append(n);
	        reversesb = reversesb.reverse();
	        int number = Integer.parseInt(reversesb.toString());	
	        int i=0;
	         StringBuilder result = new StringBuilder();
	         StringBuilder finalsb = new StringBuilder();
	        if(length%2==0){
	              while(i<length/2){
	            	  i++;
	                  int res = number%10;
	                  number = number/10;
	                  result.append(res);
	              }
	              finalsb.append(result);
	              finalsb.append(result.reverse());
	        }
	        else{
	              while(i<(length/2)+1){
	                  i++;
	            	  int res = number%10;
	                  number = number/10;
	                  result.append(res);
	              }
	              finalsb.append(result);
	              finalsb.append(result.reverse());
	        }
	        System.out.println(finalsb.toString());
	      return finalsb.toString();
	    }
	public static void main(String[] args) {
		nearestPalindromic("596891");
	}

}
