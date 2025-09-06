package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;   // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	//ギアの値により速度を変える
	public void changeGear(int afterGear) {
	    int svGear = gear;

		gear = afterGear;
		
		System.out.println("ギア" + svGear + "から" + gear +"に切り替えました");
		
	}
	
	//ギアチェンジ後の速度を表示する
	public void run(){		
		switch(gear) {
			case 1 -> System.out.println("速度は時速10kmです");
			case 2 -> System.out.println("速度は時速20kmです");
			case 3 -> System.out.println("速度は時速30kmです");
			case 4 -> System.out.println("速度は時速40kmです");
			case 5 -> System.out.println("速度は時速50kmです");
			
			default -> {
				System.out.println("速度は時速10kmです");
			}
		}
	}
}
