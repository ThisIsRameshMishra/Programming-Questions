import java.util.*;

public class juspayround3_1stques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			HashMap<Integer,Integer> hm=new HashMap<>();
			ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				hm.put(x,i);
			}
		
			for(int i=0;i<n;i++) {
				adj.add(new ArrayList<Integer>());
			}
			int e=sc.nextInt();
			for(int i=0;i<e;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				int u1=hm.get(u);
			
				int v1=hm.get(v);
			
				adj.get(u1).add(v1);
			}
			
			int source=sc.nextInt();
			int destination=sc.nextInt();
			int s=hm.get(source);
			
			int d=hm.get(destination);
			
		
			if(dfs(adj,s,d,n)) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			
	}
	public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int s,int d,int n) {

		boolean vis[] = new boolean[n];

		Queue<Integer> q = new LinkedList<>();
		
		q.add(s);
		
		vis[s] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == d) return true;
			
			for(int neighbor: adj.get(cur)) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					
				}
			}
		}
		return false;
	}

}
