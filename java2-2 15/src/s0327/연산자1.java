package s0327;

import java.util.Scanner;

public class 연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 a를 입력받아서 짝수, 홀수 여부를 출력
	
		Scanner A= new Scanner(System.in);
		int a;
		System.out.println("숫자입력:");
		a=A.nextInt();
		if(a%2==0)
			System.out.println(a+" 는짝수입니다.");
		else
			System.out.println(a+"는 홀수입니다.");
		
				
	}

}
