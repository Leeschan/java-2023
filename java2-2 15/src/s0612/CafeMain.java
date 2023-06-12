package s0612;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe c=new Cafe();
		c.maketea(5);
		c.maketea(2, 3);
		c.maketea(4, 5, 10);
		c.printcount();
		
		Cafe c2=new Cafe();
		c2.maketea(1);
		c2.maketea(1, 2);
		c2.maketea(3, 4, 2);
		c2.printcount();
	}

}
