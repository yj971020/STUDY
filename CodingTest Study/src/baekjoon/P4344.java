package baekjoon;

import java.util.Scanner;

public class P4344 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt(); // �׽�Ʈ ���̽��� ��
		String[] answer=new String[num];
		
		for(int i=0;i<num;i++) {
			int numOfStuBeyondAvg=0; // ����� �Ѵ� �л� ��
			double avg=0; //���
			int sum=0;
			int numOfStu = Integer.parseInt(sc.next()); // �л���
			int[] scores=new int[numOfStu];
			for(int j=0;j<numOfStu;j++) {
				int score = Integer.parseInt(sc.next());
				scores[j]=score;  //�迭�� ������ �ϳ��� ���� 
				sum+= score;
			}
			avg=(double)sum/numOfStu; //�� �׽�Ʈ ���̽� �� ���
			
			for(int k=0;k<numOfStu;k++) {
				if(scores[k]>avg) {
					numOfStuBeyondAvg++;  //����� ���� �л� ��
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
