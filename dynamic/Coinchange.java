package dynamic;

import java.util.Scanner;

public class Coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int U=sc.nextInt();
		int V=sc.nextInt();
		int A=sc.nextInt();
		int S=sc.nextInt();
		float v=0;
		float x=0;
		if(U<=V) {
			System.out.println("Yes");
		}
		else {
		x=(U*U)-(2*A*S);
		if(x<0) {
			System.out.println("No");
		}
		else {
			v=(float) Math.pow(x, 0.5);
		}
		if(v<=V ) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	
		}
}
}
