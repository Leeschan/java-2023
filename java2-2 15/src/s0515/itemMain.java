package s0515;

public class itemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item phone=new item("갤럭시 s22+");
		phone.price=900000;
		phone.printItemInfo();
		item phone2=new item("Iphone 15",1500);
		phone2.printItemInfo();
		item ram=new item("DDR5",200);
		ram.printItemInfo();
	}

}
