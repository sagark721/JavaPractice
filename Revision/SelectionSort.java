package Revision;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {1111,1,111,111111,11};

		for(int i=0;i<a.length;i++) {
			int pos=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[pos]>a[j]) {
					pos=j;
				}

			}
			if(pos!=i) {
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}



	}


}
