package leetcodequestions;

public class ComplexNumber {
	 public static String complexNumberMultiply(String a, String b) {
	        String[] str = a.split("\\+");
	        String w = str[0];
	        String x = str[1];
	        String[] s = b.split("\\+");
	        String y = s[0];
	        String z = s[1];
	        StringBuilder  sb = new StringBuilder();
	        for(int i=0;i<x.length();i++){
	            if(x.charAt(i)=='i')
	                break;
	            else {
	            	sb.append(x.charAt(i));;
	            }
	        }
	        String st = sb.toString(); 
	        int e=Integer.parseInt(st);
	         StringBuilder sb2 = new StringBuilder();
	         for(int i=0;i<z.length();i++){
	            if(z.charAt(i)=='i')
	                break;
	            else {
	            	sb2.append(z.charAt(i));;
	            }
	        }
	        String strg = sb2.toString();
	        int f = Integer.parseInt(strg);
	        int first =  Integer.parseInt(w)*Integer.parseInt(y);
	        int second = Integer.parseInt(w)*f + Integer.parseInt(y)*e;
	        int third = -1*e*f;
	         StringBuilder finalsb = new StringBuilder();
	          finalsb.append(first+third);
	          finalsb.append("+");
	          finalsb.append(second);
	          finalsb.append("i");
	                return finalsb.toString();
	    }
	public static void main(String[] args) {
		System.out.println(complexNumberMultiply("1+99i", "1+1i"));

	}

}
