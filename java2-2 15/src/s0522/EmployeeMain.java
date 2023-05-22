package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자기이름, 학번, 나이를 출력하시오
		Employee e1=new Employee();
		e1.setName("이승찬");
		e1.setNo(20215);
		e1.setAge(25);
		System.out.println(e1.toString());
		
		Employee e2=new Employee("승찬",20215,17);
		System.out.println(e2.toString());
	}

}
