import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Dijkstra {
	public static class vertex implements Comparable<vertex>{
		String name;
		public vertex(String name){
			this.name=name;
		}
		int minDistance=Integer.MAX_VALUE;
		edge[] adj;
		vertex pre=null;
		@Override
		public int compareTo(vertex o) {
			// TODO Auto-generated method stub
			return Integer.compare(minDistance, o.minDistance);
		}
	}
	
	public static class edge{
		vertex end;
		int weight;
		public edge(vertex end, int weight){
			this.end=end;
			this.weight=weight;
		}
	}
	
	public static void dijkstra(vertex start){
		PriorityQueue<vertex> q=new PriorityQueue<vertex>();
		start.minDistance=0;
		q.add(start);
		while(!q.isEmpty()){
			vertex v=q.remove();
			for (edge e:v.adj){
				vertex s=e.end;
				int weight=e.weight;
				int distance=v.minDistance+weight;
				if (distance<s.minDistance){
					q.remove(s);
					s.minDistance=distance;
					s.pre=v;
					q.add(s);
				}
			}
		}
	}
	
	public static ArrayList<vertex> printPath(vertex target){
		ArrayList<vertex> path=new ArrayList<vertex>();
		for (vertex v=target;v!=null;v=v.pre){
			path.add(v);
		}
		Collections.reverse(path);
		return path;
	}
	
	public static void main(String[] args){
		vertex A=new vertex("A");
		vertex B=new vertex("B");
		vertex C=new vertex("C");
		vertex D=new vertex("D");
		vertex E=new vertex("E");
		vertex[] vertices={A,B,C,D,E};
		
		A.adj=new edge[]{
				new edge(B,5),
				new edge(D,2),
				new edge(E,4)	
			};
			B.adj=new edge[]{
					new edge(C, 3),
					new edge(D, 6),
					new edge(E, 8),
					new edge(A, 5)
			};
			C.adj=new edge[]{
					new edge(E, 8),
					new edge(B, 3)
			};
			D.adj=new edge[]{
					new edge(A, 2),
					new edge(E, 6),
					new edge(B, 6)
			};
			E.adj=new edge[]{
					new edge(A, 4),
					new edge(B, 8),
					new edge(C, 8),
					new edge(D, 6)
			};
			
			dijkstra(A);
			for (vertex v:vertices){
				System.out.println("The minimum distance to "+v.name+" is "+v.minDistance);
			}
			for (vertex v:vertices){
				ArrayList<vertex> path=printPath(v);
				for (vertex p:path){
					System.out.print(p.name+" ");
				}
				System.out.println();
			}
		
	}
}