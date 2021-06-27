
public class trailingzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=10;
	int res=0;
	for(int i=5;i<=n;i=i*25) {
		res=res+(n/i);
	}
	System.out.println(res);
	}

}
