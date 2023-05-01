package s0501;

public class car {

	String owner;
	String color;
	int speed;
	int km;
	static int count;
	car(){
		count++;
	}
	private car(String name){
		owner=name;
		count++;
	}
	car(String name, String col, int speed)
	{
		this.owner=name;
		this.color=col;
		this.speed=speed;
		count++;
		System.out.println("총 차의 대수:"+count);
	}
	
	void run(){
		km= km+10;
	}
	void stop() {
		speed=0;
		System.out.println(owner+"의 차는"+km+"를 달렸습니다");
	}
	void speedup() {
		speed+=5;
		System.out.println(owner+"의 차의 현재속도는"+speed+"입니다");
		km+=2;
		System.out.println(owner+"의 차의 주행거리는"+km+"입니다");
	}
	void speeddown() {
		speed-=5;
		System.out.println(owner+"의 차의 현재속도는"+speed+"입니다");
	}
	void printcarInfo() {
		System.out.println("소유자:"+owner);
		System.out.println("색상:"+color);
		System.out.println("현재속도:"+speed);
		System.out.println("주행거리:"+km);
	}
}
