
import java.util.*;




class Pair implements Comparator<Pair>{
	
	private int v;
	private int weight;
	Pair(int V,int W){
		v=V;
		weight=W;
	}
	Pair(){}
	int getV() {return v;}
	int getWeight() {return weight;}
	@Override
	public int compare(Pair node1, Pair node2) {
		if(node1.weight<node2.weight) {
			return -1;
		}
		if(node1.weight>node2.weight) {
			return 1;
		}
		return 0;
	}
	
}
public class juspayround3_2ndQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			hm.put(x,i);
		}
	
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Pair>());
		}
		int e=sc.nextInt();
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			int u1=hm.get(u);
		
			int v1=hm.get(v);
			int w=sc.nextInt();
			adj.get(u1).add(new Pair(v1,w));
		}
		int source=sc.nextInt();
		int destination=sc.nextInt();
		int s=hm.get(source);
		
		int d=hm.get(destination);
		int ans=dijkstra(adj,s,d,n);
		System.out.println(ans);
	}
	
	private static int dijkstra(ArrayList<ArrayList<Pair>> adj, int s,int d,int N) {
		int dist[]=new int[N];
		for(int i=0;i<N;i++) {
			if(i!=s)
			dist[i]=1000000;
		}
		dist[s]=0;
		PriorityQueue<Pair> p=new PriorityQueue<Pair>(N,new Pair());
		p.add(new Pair(s,0));
		while(p.size()>0) {
			Pair node=p.poll();
			for(Pair i:adj.get(node.getV())) {
				if(dist[node.getV()]+i.getWeight()<dist[i.getV()]) {
					dist[i.getV()]=dist[node.getV()]+i.getWeight();
					p.add(new Pair(i.getV(),dist[i.getV()]));
				}
			}
		}
		return dist[d];
	}

}
