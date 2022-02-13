package skTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	 public static int solution(String[] color, int[] prices) {
	        int answer = 0;
	        int count = color.length; // 명수
	        int set=0;// 세트 갯수
	        String[] s=new String[count];//상의
	        String[] h=new String[count];//하의
	  
	        for(int i=0;i<count;i++) {
	        	String[] temp=color[i].split("");
	        	s[i]=temp[0]; h[i]=temp[1];//상하의 각각 배열에 저장
	        }
	       Arrays.sort(s); Arrays.sort(h);
	       System.out.println(Arrays.toString(h));
	       System.out.println(Arrays.toString(s));
	       for(int i=0;i<count;i++) {
	    	   if(s[i].equals(h[i])) {
	    		   set++;
	    	   }
	       }
	       	answer=prices[0]*set + prices[1]*(count-set);
	       	System.out.println("set"+set);
	       	System.out.println(answer);
	       	
	   	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] color= {"RG","WR","BW","GG"};
		String[] color= {"RR","WW","GG","GG","BB"};
		int[] prices= {2000,6000};
		solution(color,prices);
	}

}
