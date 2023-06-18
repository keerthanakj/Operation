package operation;

public class UnaryOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=9;
		a += a++ - ++b + a;
		System.out.println("a="+a);
		
		int x=3,y=7;
		x -= (x++ - ++y);
		System.out.println("x="+x);
		
		int k=5,j=5;
		k = 5 * ++k;
		System.out.println("k="+k);
		k = 5 * k++;
		System.out.println("k="+k);
	
		
		int l=2,m=3,n=3;
		l = l- (m++) * (--n);	
		System.out.println("l="+l);
		l = l * (++m) %n;
		System.out.println("l="+l);
		
	}

}
