package s0522;

import java.util.Scanner;

public class Account {
	private String name;
	private int no;
	private int balance;
	
	public Account() {}
	public Account(String name, int no) {
		this.name=name;
		this.no=no;
	}
	public Account(String name, int no, int balance) {
		this.name=name;
		this.no=no;
		this.balance=balance;
	}
	String getName() {return name;}
	int getNo() {return no;}
	int getBalance() {return balance;}
	
	void setName(String name) {
		this.name=name;
	}
	void setNo(int no) {
		this.no=no;
	}
	void setBalance(int balance) {
		this.balance=balance;
	}
	void printInfo() {
		System.out.println("[계좌정보]예금주:"+name);
		System.out.println("계좌번호:"+no);
		System.out.println("현재잔고:"+balance);
		System.out.println("===============");
	}
	void 입금(int money) {
		balance+=money;
		System.out.println(name+"님 잔액은"+money+"원 입금하여 현재잔액"+balance+"원");
	}
	void 출금(int money) {
		if(money<balance) {
			balance-=money;
			
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
}
