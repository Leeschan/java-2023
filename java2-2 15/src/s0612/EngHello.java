package s0612;

public class EngHello extends Greeting{
	public String name="lee seung chan";
	public void sayHello() {
		System.out.println("Hello");
		}
	public void sayGreeting() {
		super.sayHello();
	}
	public static void main(String[] args) {
		EngHello eng=new EngHello();
		eng.sayHello();
	}
}
