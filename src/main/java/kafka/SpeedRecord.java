package kafka;

public class SpeedRecord {
	public String licencePlate;
	public int speed;



	public SpeedRecord(String licencePlate, int speed) {
		super();
		this.licencePlate = licencePlate;
		this.speed = speed;
	}

	public String toString() {
		return licencePlate+" "+speed;
	}
	public SpeedRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
