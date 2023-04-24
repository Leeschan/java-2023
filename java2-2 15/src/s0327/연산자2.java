package s0327;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner 입력기=new Scanner(System.in);
		int a, b;
		char op;
		System.out.println("숫자a:");
		a=입력기.nextInt();
		System.out.println("숫자b:");
		b=입력기.nextInt();
		System.out.println("연산자:");
		op=입력기.next().charAt(0);
		if(op=='+')
			System.out.printf("%d+%d=%d",a,b,a+b);
		if(op=='-')
			System.out.printf("%d-%d=%d",a,b,a-b);
		if(op=='*')
			System.out.printf("%d*%d=%d",a,b,a*b);
		if(op=='/')
			System.out.printf("%d/%d=%d",a,b,a/b);
		
	}

}
