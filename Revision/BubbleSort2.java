package Revision;

public class BubbleSort2 {

	public static void main(String[] args) {
		int [] a= {1111,1,111,11};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length-1;j++) {
				if(a[i]>a[j+1]) {
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
