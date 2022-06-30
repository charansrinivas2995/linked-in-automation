package testcases;

public class ProtechtedMembersTest {

	public static void main(String[] args) {
		Car1 car = new Car1();

		car.increaseSpeed(30);

		System.out.println("Car current speed is : " + car.getSpeed());

		car.decreaseSpeed(10);

		System.out.println("Car current speed is : " + car.getSpeed());

		car.increaseSpeed(40);

		System.out.println("Car current speed is : " + car.getSpeed());

		car.decreaseSpeed(20);

		System.out.println("Car current speed is : " + car.getSpeed());

		car.increaseSpeed(50);

		System.out.println("Car current speed is : " + car.getSpeed());

		car.decreaseSpeed(30);

		System.out.println("Car current speed is : " + car.getSpeed());
		
		car.increaseSpeed(60);

		System.out.println("Car current speed is : " + car.getSpeed());

	}
}
