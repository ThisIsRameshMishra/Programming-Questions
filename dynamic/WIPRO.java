package dynamic;

import java.util.ArrayList;

public class WIPRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi Hello";
		int n=s.length();
		
		int i=0;
		
		while(i<n) {
			int cur=0;
			
			ArrayList<Character> a=new ArrayList<>();
			while(s.charAt(i++)!=' ' || i<n ) {
				cur++;
				a.add(s.charAt(i));
				
				
				
			}
			if(i==n-1) {
				break;
			}
		
			
			for(char ch:a) {
				int x=ch;
				x=x+cur;
				if(x>90 && x<97) {
					System.out.print("z");
				}
				if(x<=90) {
					char y=(char)x;
					System.out.print(y);
				}
				if(x>122) {
					System.out.print("Z");
				}
				if(x>=97 && x<=122) {
					char y=(char) x;
					System.out.print(y);
				}
			}
			System.out.print(" ");
			
			
			
			
		}
	}

}
