package codechef;

import java.util.Scanner;

public class lubch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		for(int j=0;j<200;j++) {
		int num=sc.nextInt();
		int c=0;
		if(num>=1 && num<=1000000) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c%2!=0) {
			System.out.println("1");
			break;
		}
		else {
			System.out.println("0");
		}
		}
		else {
			System.out.println("-1");
		}
	
	}
	}
	}
}
