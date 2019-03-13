package sum;

import java.util.Scanner;

public class sum02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度为：");
		int n=sc.nextInt();
		int[] c = new int[n];
		System.out.println("请输入"+n+"个整数");
		for(int i=0;i<n;i++)
		{
			c[i] = sc.nextInt();
		}
		
		int f=0;//定义整形变量f，为子数组最大值
		int sum=0;//定义整形变量sum，为子数组求和
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
		
		System.out.println("该数组的子数组之和的最大值为："+f);

	}

}
