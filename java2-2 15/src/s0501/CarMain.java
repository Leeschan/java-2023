package s0501;
import s0417.Student;
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car myCar=new car();
		car yourCar=new car(".","파랑",100);
		car yourCar2=new car("..","파랑",100);
		myCar.owner="예섭";
		myCar.km=0;
		myCar.speed=0;
		myCar.color="핑크";
		myCar.printcarInfo();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.speedup();
		myCar.speedup();
		myCar.speedup();
		myCar.stop();
		
		yourCar.printcarInfo();
		yourCar.speedup();
		
		Student s=new Student();
	}

}
