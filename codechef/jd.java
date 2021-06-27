package codechef;

import java.util.Scanner;

public class jd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int w1=sc.nextInt();
			int w2=sc.nextInt();
			int x1=sc.nextInt();
			int x2=sc.nextInt();
			int m=sc.nextInt();
			int a=m*x1;
			int b=m*x2;
			int o=Math.max(a, b);
			int p=Math.min(a, b);
			int k=w2-w1;
			if(k>=p && k<=o) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}

}
