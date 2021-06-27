package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Nobelprize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int c=1;
			int max=0;
			for(int i=0;i<n-1;i++) {
				if(a[i]==a[i+1]) {
					c++;
				}
				else {
					c=1;
				}
				if(max<c) {
					max=c;
				}
			}
			System.out.println(max);
			if(max==1) {
				max=0;
				
			}
			System.out.println(n-max);
			 if(n-max<m) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}

}
