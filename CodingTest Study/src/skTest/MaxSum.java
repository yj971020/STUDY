package skTest;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        Collections.sort(list,Collections.reverseOrder());
    	int sum=0;
    	for(int i=0;i<2;i++) {
    		sum=sum+ list.get(i);
    	}
    	return sum;
       }
    
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(5, 9, 7, 11);
       // List<Integer> list = Arrays.asList(10, 9, 7, 11,55,66,88);
        
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
    }
}