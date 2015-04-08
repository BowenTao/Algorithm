import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphSearch {
	public static void DFS(ArrayList<ArrayList<Character>> adj, char begin){
		boolean[] visited=new boolean[256];
		visit(adj,visited,begin);
	}
	
	public static void visit(ArrayList<ArrayList<Character>> adj, boolean[] visited, char begin){
		visited[begin]=true;
		System.out.print(begin+" ");
		for (char v:adj.get(begin)){
			if (!visited[v]){
				visit(adj,visited,v);
			}
		}
	}
	
	public static void BFS(ArrayList<ArrayList<Character>> adj, char begin){
		boolean[] visited=new boolean[256];
		Queue<Character> q=new LinkedList<Character>();
		q.add(begin);
		visited[begin]=true;
		while (!q.isEmpty()){
			char v=q.remove();
			System.out.print(v+" ");
			for (char c:adj.get(v)){
				if (!visited[c]){
					q.add(c);
					visited[c]=true;
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		ArrayList<ArrayList<Character>> adj=new ArrayList<ArrayList<Character>>();
		for (int i=0;i<256;i++){
			adj.add(new ArrayList<Character>());
		}
		
		adj.get('A').add('B');
		adj.get('A').add('D');
		adj.get('A').add('E');
		
		adj.get('B').add('A');
		adj.get('B').add('C');
		adj.get('B').add('D');
		adj.get('B').add('E');
		
		adj.get('C').add('B');
		adj.get('C').add('E');
		
		adj.get('D').add('A');
		adj.get('D').add('B');
		adj.get('D').add('E');
		
		adj.get('E').add('A');
		adj.get('E').add('B');
		adj.get('E').add('C');
		adj.get('E').add('D');
		
		DFS(adj, 'A');
		System.out.println();
		BFS(adj, 'A');
		
	}
}