package leetcodequestions;

public class Powerof2 {
int n =1;
Boolean flag=false;
int i=1;
int j;
boolean display(){
if(n>0 && (n%2==0)){
	while (i<=n) {
		i=i*2;
	}
	if(i==n){
		flag=true;
	}
}

System.out.println(flag);
	return flag;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powerof2 p = new Powerof2();
		p.display();

	}

}
