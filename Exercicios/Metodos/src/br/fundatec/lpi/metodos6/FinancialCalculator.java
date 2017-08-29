package br.fundatec.lpi.metodos6;

public class FinancialCalculator {

	public static double conv(String originCoin, double inicialPrice, String finalCoin) {
		upperCaseCoins(originCoin, finalCoin);
		if (originCoin.equals("BRL")) {
			return convFromBRL(inicialPrice, finalCoin);
		} else if (originCoin.equals("USD")) {
			return convFromUSD(inicialPrice, finalCoin);
		} else if (originCoin.equals("EUR")) {
			return convFromEUR(inicialPrice, finalCoin);
		}
		return convFromGBP(inicialPrice, finalCoin);
	}

	private static double convFromGBP(double inicialPrice, String finalCoin) {
		if (finalCoin.equals("BRL")) {
			return inicialPrice * 4.08;
		} else if (finalCoin.equals("USD")) {
			return inicialPrice * 1.29;
		} else if (finalCoin.equals("EUR")) {
			return inicialPrice * 1.07;
		}
		return inicialPrice;
	}

	private static double convFromEUR(double inicialPrice, String finalCoin) {
		if (finalCoin.equals("BRL")) {
			return inicialPrice * 3.78;
		} else if (finalCoin.equals("USD")) {
			return inicialPrice * 1.19;
		} else if (finalCoin.equals("GBP")) {
			return inicialPrice * 0.9;
		}
		return inicialPrice;

	}

	private static double convFromUSD(double inicialPrice, String finalCoin) {
		if (finalCoin.equals("BRL")) {
			return inicialPrice * 3.16;
		} else if (finalCoin.equals("EUR")) {
			return inicialPrice * 0.83;
		} else if (finalCoin.equals("GBP")) {
			return inicialPrice * 0.77;
		}
		return inicialPrice;

	}

	private static double convFromBRL(double inicialPrice, String finalCoin) {
		if (finalCoin.equals("USD")) {
			return inicialPrice * 0.31;
		} else if (finalCoin.equals("EUR")) {
			return inicialPrice * 0.26;
		} else if (finalCoin.equals("GBP")) {
			return inicialPrice * 0.24;
		}
		return inicialPrice;

	}

	private static void upperCaseCoins(String originCoin, String finalCoin) {
		originCoin = originCoin.toUpperCase();
		finalCoin = finalCoin.toUpperCase();
	}

}
