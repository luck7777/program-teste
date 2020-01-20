package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double cotacaoMoeda(double valorMoeda) {
		return valorMoeda;
	}
	public static double valorDeCompra(double valorMoeda) {
		return IOF * (cotacaoMoeda(valorMoeda) * valorDeCompra(valorMoeda)) / 100 + valorDeCompra(valorMoeda);
	}

}
