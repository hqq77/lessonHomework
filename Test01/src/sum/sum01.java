package sum;

import java.util.Scanner;

public class sum01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������������
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���Ϊ��");
		int n=sc.nextInt();
		int[] c = new int[n];
		System.out.println("������"+n+"������");
		for(int i=0;i<n;i++)
		{
			c[i] = sc.nextInt();
		}
		
		//����������Լ���С�Ƚ�
		int f=c[0];//�������α���f��Ϊ���������ֵ
		int sum=0;//�������α���sum��Ϊ���������
		for (int j=0;j<n;j++) 
		{
		for (int i=j;i<n;i++)
		{
			sum=sum+c[i];
			if(f<sum)
			{
				f=sum;//ÿ�����֮��sum�����е����ֵ���бȽ�
			}
		}
		    sum=0;
		}
		
		System.out.println("�������������֮�͵����ֵΪ��"+f);
		
		/*for(int i=0;i<n;i++)
		{
			System.out.println(c[i]+"  ");
		}*/

	}

}
