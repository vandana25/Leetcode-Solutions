package leetcodequestions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumebers {
	static Set<Integer> set = new HashSet<Integer>();
//	set.add(n);
	public static boolean dis(int n) {
		set.add(n);
        int i;
        int res=0;
        while(n> 0){
            i = n%10;
            n= n/10;
            res+=i*i;
        }
        if(res==1)
        	return true;
        else if(!set.add(res)) {
        	return false;
        } else
        	return dis(res);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HappyNumebers h = new HappyNumebers();
System.out.println(dis(13));
	}

}
