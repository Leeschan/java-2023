package s0403;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("수입력:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++)
			if(i%2==0) {
				sum-=i;
				System.out.println("-"+i);
			}else {
				sum+=i;
				System.out.println("+"+i);
		
			}
		System.out.println("="+sum);
	}

}
