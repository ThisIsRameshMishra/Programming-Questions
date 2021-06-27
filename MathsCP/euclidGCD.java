
public class euclidGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long g=gcd(60000000,5);
		
		System.out.println(g);
	}
  static long gcd(long a,long b) {
	  if(b==0) return a;
	  
		 return gcd(b,a%b);
	  
  }
  static int lcm(int a,int b,int hcf) {
	  return (a*b)/hcf;
  }
}
