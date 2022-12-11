package util;

public class Calculator {
	public static final int IOF = 6;
	public static double converter(double dollar, double reais) {
		double taxa = ((dollar/100) * IOF) * 200;
		return dollar*reais+taxa;
	}
}
