import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int c=n;
			int x=0;
			int ans=0;
			while(n>0) {
				x=n%10;
				int y=(int) Math.pow(x, 3);
				ans+=y;
				n=n/10;
				
			}
			if(ans==c) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
	}

}
