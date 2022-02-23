package skTest;

import java.util.Arrays;

public class Solution4 {

	
	 public static int[] solution(String[] rsp3) {
	        int size = rsp3.length; //몇 판
	        int[] win=new int[3]; // 누적점수
	        int j=0;
	        for(String s :rsp3) {
	        	String[] temp = s.split(""); // 나눔 
	        	int[] rsp=new int[3]; // 숫자로 저장 배열	        	       
	        	if(temp[0].equals(temp[1]) & temp[1].equals(temp[2])) {
	        		continue;
	        	}else {
	        		for(int i=0;i<3;i++) {
	        		switch (temp[i]) {
					case "S":
						rsp[i]=1;
						break;
					case "R":
						rsp[i]=2;
						break;
					case "P":
						rsp[i]=3;
						break;
					default:
						break;
					}
	        			}
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
