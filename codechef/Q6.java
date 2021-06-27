package codechef;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			int a[]=new int[60];
			a[0]=0;
			a[1]=1;
			for(int i=2;i<a.length;i++) {
				a[i]=((a[i-1]%10)+(a[i-2]%10))%10;
			}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			long k=1;
			while(n>1) {
				k=k*2;
				n=n/2;
			}
			k=k%60-1;
			System.out.println(k);
			System.out.println(a[(int) k]);
		}
	}
}
/*3
2 2 2
1 2
0 1
0 0
0 0
2 2 2
1 2
0 1
0 0
-1 0
3 2 2
1 1
2 2
3 3
1 0
2 0
3 0*/
