package s0508;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student kim=new student();
		kim.schoolname="서울로봇고";
		System.out.println(kim.schoolname+"생성된 학생 객체수:"+student.count);
		student kang=new student();
		System.out.println(kang.schoolname+"생성된 학생 객체수:"+student.count);
		student bak=new student();
		System.out.println(bak.schoolname+"생성된 학생 객체수:"+bak.count);
		System.out.println(student.pi);
	}

}
