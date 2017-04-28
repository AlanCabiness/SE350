package hw3;

public class CarBuilder {
	private IGPS gps;
	private ITurboChargedEngine engine;
	private IColor color;
	private ITransmissionType transmission;
	private IMoonroof moonroof;

	public void setGPS(IGPS gps) {
		this.gps = gps;
	}

	public void setEngine(ITurboChargedEngine engine) {
		this.engine = engine;
	}

	public void setColor(IColor color) {
		this.color = color;
	}

	public void setTransmission(ITransmissionType transmission) {
		this.transmission = transmission;
	}

	public void setMoonroof(IMoonroof moonroof) {
		this.moonroof = moonroof;
	}

	public Car getCar() {
		return new Car(gps, engine, color, transmission, moonroof);
	}
}