package skTest;

import java.util.ArrayList;

class Solution1 {
    public static int[] solution(int[] deposit) {
        int[] answer = {};
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<deposit.length;i++){
            if(deposit[i]>0){
                list.add(deposit[i]);
            }else if(deposit[i]<0 & i>0){
            	fun(deposit[i],list);
            }
          }
        System.out.println(list);
        return answer; 
    }

    public static void fun(int deposit,ArrayList<Integer>list){
    	int lastind=list.size()-1;
    	int sum=deposit + list.get(lastind);
        if(sum>0) {
        	list.remove(lastind);
        	list.add(sum);
               }
        else if(sum<=0){
        	list.remove(lastind);
        	fun(sum,list);
        }
    }
    public static void main(String[] args) {
		//int[] deposit={500,1000,2000,-1000,-1500,-100};
		int[] deposit={500,1000,-300,200,-400,100,-100};
			solution(deposit);
    	}
    }