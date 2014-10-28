/**
 * idea from S.Saurabh
 */
public class Permutation {
	public static void permutate(int[] A, int startIndex, int endIndex){
		if (startIndex==endIndex){
			for (int i=0;i<A.length;i++){
				System.out.print(A[i]);
			}
			System.out.println();
		}else{
			for (int i=startIndex;i<=endIndex;i++){
				int t=A[startIndex];
				A[startIndex]=A[i];
				A[i]=t;
				permutate(A, startIndex+1, endIndex);
				t=A[startIndex];
				A[startIndex]=A[i];
				A[i]=t;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a={3,4,5,6};
		permutate(a, 0, 3);
	}
}
