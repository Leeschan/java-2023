package s0417;

public class StudentMain {

	public static void main(String[] args) {
		Student hong=new Student();
		Student kim=new Student();
		Student lee=new Student("이지은",20,2,789,48);
		lee.printAll();
		
		hong.age=10;
		hong.grade=6;
		hong.name="홍길동";
		hong.number=25;
		hong.printAll();
		
		hong.age=12;
		hong.grade=8;
		hong.name="김민준";
		hong.number=15;
		hong.printAll();
	}

}
