
public class Nextpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		nextpermutation(a,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

	static void nextpermutation(int nums[],int n) {
		 int i=nums.length-2;
	        while(i>=0 && nums[i]>=nums[i+1]){
	            i--;
	        }
	        if(i>=0){
	            int j=nums.length-1;
	            while(nums[j]<=nums[i] && j>=0){
	                j--;
	            }
	            swap(nums,i,j);
	        }
	        reverse(nums,i+1,nums.length-1);
	    }
	

public static void swap(int[] a,int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
public static void reverse(int a[],int i,int j){
    while(i<j) swap(a,i++,j--);
}

}
