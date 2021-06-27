package codechef;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Collegelife5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
		Map<Long,Integer> map=new HashMap<>();
		
		
		for(int i=0;i<n;i++) {
			long x=sc.nextLong();
			map.put(x, 0);
		}
		for(int i=0;i<m;i++) {
			long x=sc.nextLong();
			map.put(x, 1);
		}
		TreeMap<Long, Integer> sorted = new TreeMap<>();
		  
        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);
  
        // Display the TreeMap which is naturally sorted
        int cur=0;
		int ans=0;
        for (Map.Entry<Long, Integer> entry : sorted.entrySet()) {
        	if(entry.getValue()!=cur) {
        		ans++;
        		cur=1-cur;
        	}
        }
        System.out.println(ans);
		

		//Set<Entry<Integer, Integer>> entries=map.entrySet();
		//for(Entry<Integer, Integer> entry:entries) {
		//	if(entry.getKey()!=cur) {
		//		ans++;
		//		cur=1-cur;
		//	}
		//}
		
	}
	}

}
