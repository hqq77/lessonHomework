package sum;

import java.util.Scanner;

public class sum01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//整形数组的输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度为：");
		int n=sc.nextInt();
		int[] c = new int[n];
		System.out.println("请输入"+n+"个整数");
		for(int i=0;i<n;i++)
		{
			c[i] = sc.nextInt();
		}
		
		//子数组求和以及大小比较
		int f=c[0];//定义整形变量f，为子数组最大值
		int sum=0;//定义整形变量sum，为子数组求和
		for (int j=0;j<n;j++) 
		{
		for (int i=j;i<n;i++)
		{
			sum=sum+c[i];
			if(f<sum)
			{
				f=sum;//每次求和之后将sum与已有的最大值进行比较
			}
		}
		    sum=0;
		}
		
		System.out.println("该数组的子数组之和的最大值为："+f);
		
		/*for(int i=0;i<n;i++)
		{
			System.out.println(c[i]+"  ");
		}*/

	}

}
