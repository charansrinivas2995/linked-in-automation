package testcases;

public class Car1 {
	private int speed = 0;

	public int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		if (speed >= 120) {
			System.out.println("Car Speed cannot increase morethan 120KMH");
		} else {
			this.speed = speed;
		}

	}

	public void increaseSpeed(int speedIncrement) {

		setSpeed(speed + speedIncrement);

	}

	public void decreaseSpeed(int speedDecreament) {

		setSpeed(speed - speedDecreament);
	}

}
