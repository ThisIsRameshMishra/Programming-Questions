package dynamic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=1999;
		int max1=0;
		int min1=9;
		while(i1!=0) {
			int x=i1%10;
			if(x>max1) {
				max1=x;
			}
			if(x<min1) {
				min1=x;
			}
			i1=i1/10;
		}
		int i2=9999;
		int max2=0;
		int min2=9;
		while(i2!=0) {
			int x=i2%10;
			if(x>max2) {
				max2=x;
			}
			if(x<min2) {
				min2=x;
			}
			i2=i2/10;
		}
		int i3=9999;
		int max3=0;
		int min3=9;
		while(i3!=0) {
			int x=i3%10;
			if(x>max3) {
				max3=x;
			}
			if(x<min3) {
				min3=x;
			}
			i3=i3/10;
		}
		System.out.println((min1+min2+min3)-(max1+max2+max3));
	}

}
