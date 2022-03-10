package programmers;

import java.util.HashMap;

public class Hash3 {
	public static void main(String[] args) {
		String[][] clothes
		= {{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
	
		System.out.println(solution(clothes));
	}




    public static int solution(String[][] clothes) {
    	int answer=1;
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<clothes.length;i++){
        	String key=clothes[i][1];
            map.put(key, map.getOrDefault(key, 0)+1);
            
        }
        for(String mapkey:map.keySet()) {
        	answer*=map.get(mapkey)+1;
        }
        return answer-1;
    }
}


