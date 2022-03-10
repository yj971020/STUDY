package skTest;

import java.util.Arrays;

public class Solution {
	public static long[] solution(long n) {
		long[] fail = {-1, -1};
		long[] answer = { 0, 0 };
		int count = 0;
		for (long i = 2; i*i <= n; i++) { 
			while (n % i == 0) { 
				n = n / i;
				answer[count] = i;
				count++;
				if (count>1 | answer[0] == answer[1])
					return fail;
			}
		}
		if(count==1 && n!=1) {
		answer[count]=n;
		return answer;
		}	
		else
			return fail;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(34)));

	}
}