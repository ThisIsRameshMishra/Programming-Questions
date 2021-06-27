
public class fastpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPow(3978432,6,1000000007));
	}
	static long fastPow(long a,long b,int n) {
		long res=1;
		while(b>0) {
			//to check odd and even
			if((b&1)!=0) {
				res=(res*a%n)%n;
			}
			a=(a%n*a%n)%n;
			b=b>>1;
		}
		return res;
	}
}
