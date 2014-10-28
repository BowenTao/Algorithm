public class InsertionSort {
	public static void Insertion(int a[]){
		for (int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;
			while (j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
			
	public static void main (String[] args){
		int a[]={32,43,12,11,32,10,0};
		Insertion(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
			
			
}
