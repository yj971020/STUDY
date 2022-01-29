package baekjoon;

import java.util.Scanner;

public class P4344 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt(); // 테스트 케이스의 수
		String[] answer=new String[num];
		
		for(int i=0;i<num;i++) {
			int numOfStuBeyondAvg=0; // 평균을 넘는 학생 수
			double avg=0; //평균
			int sum=0;
			int numOfStu = Integer.parseInt(sc.next()); // 학생수
			int[] scores=new int[numOfStu];
			for(int j=0;j<numOfStu;j++) {
				int score = Integer.parseInt(sc.next());
				scores[j]=score;  //배열에 성적을 하나씩 저장 
				sum+= score;
			}
			avg=(double)sum/numOfStu; //각 테스트 케이스 별 평균
			
			for(int k=0;k<numOfStu;k++) {
				if(scores[k]>avg) {
					numOfStuBeyondAvg++;  //평균을 넘은 학생 수
				}
			}
			answer[i] = String.format("%.3f", (double)numOfStuBeyondAvg/numOfStu*100);
			
			}
	for(String s : answer)
	{
		System.out.println(s+"%");
	}
		
		
	}

}
