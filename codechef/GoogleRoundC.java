package google;

import java.util.*;

public class RoundC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		long g=sc.nextLong();
		long cursum=0;
		long k[]=new long[(int) g];
		for(long i=0;i<g;i++) {
			k[(int) i]=i+1;
		}
		
		int c=1;
		for(long i=0;i<g;i++) {
			cursum=k[(int) i];
			for(long j=i+1;j<g;j++) {
			cursum+=k[(int) j];
			if(cursum==g) {
				
				c++;
			}
			}
			
		}
		System.out.println(c);
	}
	}

}
