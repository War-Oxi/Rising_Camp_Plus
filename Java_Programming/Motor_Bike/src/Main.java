public class Main {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);

		ducati.start();
		honda.start();

		ducati.setSpeed(20);
		honda.setSpeed(0);
	}
}