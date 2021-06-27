package codechef;

import java.util.Scanner;

public class Summer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0) {
				int xa,xb,Xa,Xb;
				xa=sc.nextInt();
				xb=sc.nextInt();
				Xa=sc.nextInt();
				Xb=sc.nextInt();
				int a=0;
				int b=0;
				a=Xa/xa;
				b=Xb/xb;
				System.out.println(a+b);;
			}
	}

}
