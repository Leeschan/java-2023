package s4010;

import java.util.Scanner;

public class 문제5_1 {

	public static void main(String[] args) {
		System.out.println("숫자입력:");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0;
		int i=1;
		for( i=1;i<=num;i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.println("+"+i);
			}else {
				sum-=i;
				System.out.println("-"+i);
			}
		}
		System.out.println("="+sum);
		
	}

}
