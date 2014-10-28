
public class BubbleSort {
	public static void bubbleSort(int[] A){
		int temp;
		for (int i=0;i<A.length;i++){
			for (int j=0;j<A.length;j++){
				if (A[i]>A[j]){
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int a[]={32,43,12,11,32,10,0};
		bubbleSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
