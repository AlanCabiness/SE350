package hw3;

public class Car {
	private IGPS gps;
	private ITurboChargedEngine engine;
	private IColor color;
	private ITransmissionType transmission;
	private IMoonroof moonroof;

	public Car(IGPS gps, ITurboChargedEngine engine, IColor color, ITransmissionType transmission, IMoonroof moonroof) {
		this.gps = gps;
		this.engine = engine;
		this.color = color;
		this.transmission = transmission;
		this.moonroof = moonroof;
	}
}

interface IGPS {
}

interface ITurboChargedEngine {
}

interface IColor {
}

interface ITransmissionType {
}

interface IMoonroof {
}
