package s0612;

public class Student {
	String name;
	String hakbun;
	String phone;
	Student(){}
	Student(String name, String hakbun){
		this.name=name;
		this.hakbun=hakbun;
	}
	void sleep() {
		System.out.println(name+"잔다");
	}
	void noise() {
		System.out.println(name+"떠든다");
	}
	void eat() {
			System.out.println(name+"먹는다");
		}
	void hit() {
		System.out.println(name+"때린다");
	}
}
