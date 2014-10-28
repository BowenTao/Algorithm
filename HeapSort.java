public class HeapSort {
	public static int left(int i){
		return 2*i+1;
	}
	
	public static int right(int i){
		return 2*i+2;
	}
	
	public static void maxHeapify(int[] A, int i, int heapSize){
		int l=left(i);
		int r=right(i);
		int largest;
		int temp;
		if (l<heapSize && A[l]>A[i]){
			largest=l;
		}else{
			largest=i;
		}
		if (r<heapSize && A[r]>A[largest]){
			largest=r;
		}
		if (largest!=i){
			temp=A[i];
			A[i]=A[largest];
			A[largest]=temp;
			maxHeapify(A,largest,heapSize);
		}
	}
	
	public static void buildMaxHeap(int[] A, int heapSize){
		for (int i=(heapSize-2)/2;i>=0;i--){
			maxHeapify(A, i, heapSize);
		}
	}
	
	public static void heapsort(int[] A, int heapSize){
		buildMaxHeap(A, heapSize);
		int temp;
		for (int i=heapSize-1;i>=0;i--){
			temp=A[0];
			A[0]=A[i];
			A[i]=temp;
			maxHeapify(A, 0, i);
		}
	}
	
	public static void main(String[] args){
		int[] A={3,4,34,23,65,34,76,876,34,1,0};
		heapsort(A,A.length);
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
}
