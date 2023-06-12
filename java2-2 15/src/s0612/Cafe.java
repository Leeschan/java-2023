package s0612;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	private static int count=0;
	int getcount() {
		return count;
	}
	void setCount(int count) {
		this.count=coffee;
	}
	public void maketea(int coffee) {
		count++;
		this.coffee=coffee;
		System.out.println("블랙커피"+coffee);
	}
	public void maketea(int coffee, int sugar) {
		count++;
		this.coffee=coffee;
		System.out.println("설탕커피"+(coffee+sugar));
	}
	public void maketea(int coffee, int sugar, int cream) {
		count++;
		this.coffee=coffee;
		System.out.println("크림커피"+(coffee+sugar+cream));
	}
	public void printcount() {
		System.out.println("총 판매 수량:"+count);
	}
}
