package leetcodequestions;

public class findcomplement {

	public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        System.out.println(i-num);
        return i - num;
    }
	public static void main(String[] args) {
		
findcomplement fc = new findcomplement();
fc.findComplement(5);
	}

}
