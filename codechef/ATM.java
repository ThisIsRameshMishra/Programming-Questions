package codechef;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float w=sc.nextFloat();
		float c=sc.nextFloat();
		if(w%5==0) {
			if(w+0.5<=c) {
				System.out.println(c-(w+0.5));
			}
			else {
				System.out.println(c);
			}
		}
		else {
			System.out.println(c);
		}
	}

}
