package skTest;

import java.util.Arrays;

public class Solution4 {

	
	 public static int[] solution(String[] rsp3) {
	        int size = rsp3.length; //몇 판
	        int[] win=new int[3]; // 누적점수
	        
	        for(String s :rsp3) {
	        	s.replace("S", "1");
	        	s.replace("R","2");
	        	s.replace("p","3");
	        	String[] temp = s.split("");
	        	System.out.println(Arrays.toString(temp));
	        	if(temp[0].equals(temp[1]) & temp[1].equals(temp[2])) {
	        		continue;
	        	}else {
	        		
	        	}
	        }
	        
	        int[] answer = {};
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		String[] rsp3={"SPR","PPR","PSS","RSS","RRR"};
		solution(rsp3);

	}

}
