
public class cutRod {
	public static int cut_rod(int[] p, int n){
		if (n==0){
			return 0;
		}
		int q=Integer.MIN_VALUE;
		for (int i=0;i<n;i++){
			q=Math.max(q, p[i]+cut_rod(p, n-1-i));
		}
		return q;
	}
	
	public static int cut_rod_dynamic(int[] p, int n){
		int[] r=new int[p.length];
		r[0]=0;
		for (int j=1;j<=n;j++){
			int q=Integer.MIN_VALUE;
			for (int i=0;i<j;i++){
				q=Math.max(q, p[i]+r[j-i-1]);
			}
			r[j]=q;
		}
		return r[n];
	}
	
	public static void main(String[] args){
		int[] a={1,5,8,9,10,17,17,20,24,30};
		System.out.println(cut_rod(a, 7));
		System.out.println(cut_rod_dynamic(a, 7));
	}
}
