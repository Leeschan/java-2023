package s0522;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("이예섭",78954,300000);
		a.printInfo();
		a.입금(10000);
		a.입금(20000);
		a.출금(30000000);
	}

}
