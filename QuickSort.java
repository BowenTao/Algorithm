
public class QuickSort {
	public static void quickSort(int[] A, int p, int r){
		if (p<r){
			int q=partition(A,p,r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
	public static int partition(int[] A,int p, int r){
		int x=A[r];
		int i=p-1;
		int temp;
		for (int j=p;j<r;j++){
			if (A[j]<x){
				i++;
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		i++;
		temp=A[i];
		A[i]=A[r];
		A[r]=temp;
		return i++;
	}
	
	public static void main(String[] args){
		int a[]={32,43,12,11,32,10,0};
		quickSort(a, 0, a.length-1);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
