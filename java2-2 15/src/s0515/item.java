package s0515;

public class item {
	// 상품을 관리하는 클래스
	// 상품 이름, 가격
	String name;
	int price;

	// 생성자
	item(String str) {
		name = "제품명:" + str;
	}

	item(String name, int price) {
		this.name = "제품명:" + name;
		this.price = price * 1000;
	}

	void printItemInfo() {
		System.out.println(name);
		System.out.println("출고가:"+price);
		System.out.println("-------------");
	}
}
