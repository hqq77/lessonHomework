package sum;

import java.util.Scanner;

public class sum02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���Ϊ��");
		int n=sc.nextInt();
		int[] c = new int[n];
		System.out.println("������"+n+"������");
		for(int i=0;i<n;i++)
		{
			c[i] = sc.nextInt();
		}
		
		int f=0;//�������α���f��Ϊ���������ֵ
		int sum=0;//�������α���sum��Ϊ���������
		for(int i=0;i<n;i++)
		{
			sum = sum+c[i];
			if(sum < 0)
			{
				sum=0;
			}
			if(sum > f)
			{
				f = sum;
			}
		}
		
		if(sum == 0)
		{
			for(int i=0;i<n;i++)
			{
				if(i == 0)
				{
					f = c[i];
				}
				if(f < c[i])
				{
					f = c[i];
				}
			}
		}
		
		System.out.println("�������������֮�͵����ֵΪ��"+f);

	}

}
