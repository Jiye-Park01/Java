package exam_2;

import java.util.Scanner;

public class Joon4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[30];
		int[] check = new int[28];
		int[] stu = new int[2];
		
		for(int i = 0; i < 30; i++)
			num[i] = i+1;
		for(int i = 0; i < 28; i++)
			check[i] = sc.nextInt();
		for(int i = 0; i < 28; i++)
		{
			int k = 0;
			for(int j = 0; j < 30; j++)
			{
				if(num[j] == check[i])
					continue;
				else if(num[29] != check[i])
				{	
					stu[k] = check[i];
					k++;
				}
			}
		}
		System.out.println(stu[0] + "\n" + stu[1]);
	}
}
