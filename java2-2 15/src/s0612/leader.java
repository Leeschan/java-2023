package s0612;

public class leader extends Student {
	boolean lead;
	public leader(boolean lead)
	{
	this.lead=lead;// TODO Auto-generated constructor stub
	}
	leader(String name, String hakbun, boolean lead){
		super(name, hakbun);
		this.lead=lead;
	}
	void isleader() {
		if(lead==true)
			System.out.println(name+"학급회장");
		else
			System.out.println(name+"학급회장 아니다.");
	}
}
