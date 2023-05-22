package s0522;

public class Circle {
	private double radius;//반지름
	private final static double PI=3.14;
	Circle(){}
	Circle(double radius){
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double computeArea() {
		return radius*radius*PI;
	}
	double computeperimeter() {
		//원의 둘레:2*PI*r;
		return 2*PI*radius;
	}
	void print() {
		System.out.println("원의 반지름:"+radius);
		System.out.println("넓이:"+computeArea());
		System.out.println("둘레:"+computeperimeter());
		System.out.println("-----------------------");
	}
}
