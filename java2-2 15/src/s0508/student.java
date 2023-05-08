package s0508;

public class student {
	private String name;
	private int grade;
	private float score;
	static int count=0;
	static String schoolname="로봇고";
	static final float pi=3.141592f;
	student(){
		count++;
	}
	void setName(String n){
			name=n;	}
	String getName() {
		return name;
	}
		void setGrade(int g) {
		grade=g;
	}
		int getGrade() {
			return grade;
		}
		void setScore(float c) {
			score=c;
		}
		float getScore() {
			return score;
		}
		void printAll() {
			System.out.println(getName()+getGrade()+":"+getScore());
		}
}
