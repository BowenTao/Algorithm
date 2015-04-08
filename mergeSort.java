
public class mergeSort {
	public static void MergeSort(int[] A, int p, int r){
		if (A.length<1){
			System.out.println("Array is empty!");
		}
		if (p<r){
			int q=(p+r)/2;
			MergeSort(A, p, q);
			MergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r){
		int n1=q-p+1;
		int n2=r-q;
		int[] L=new int[n1+1];
		int[] R=new int[n2+1];
		for (int i=0;i<n1;i++){
			L[i]=A[p+i];
		}
		for (int i=0;i<n2;i++){
			R[i]=A[q+1+i];
		}
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=p;k<=r;k++){
			if (L[i]<=R[j]){
				A[k]=L[i];
				i++;
			}else{
				A[k]=R[j];
				j++;
			}
		}
	}
	
	public static void main(String[] args){
		int[] A={3,6,9,10,32,1,1,2,0,43};
		MergeSort(A, 0, A.length-1);
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
}
