package s0508;

public class getsetexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student kim=new student();
		System.out.println(kim.getName());
		kim.setName("김경화");
		kim.setGrade(3);
		System.out.println(kim.getName()+"는"+kim.getGrade()+"학년입니다");

		student chan=new student();
	chan.setName("이승찬");
	chan.setGrade(2);
	System.out.println(chan.getName()+"는"+chan.getGrade()+"학년입니다");
	
	
	}
}
