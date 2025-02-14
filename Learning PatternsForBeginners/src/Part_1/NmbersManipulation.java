package Part_1;

public class NmbersManipulation {

	public static void main(String[] args) {
		int number = 12345;
		
		try {		
			System.out.println(getLastNSymbols(number, 2));
			
			System.out.println(getWithoutLastNSymbols(number, 2));
			
			System.out.println(getFirstNSymbols(number, 2));
			
			System.out.println(getWithoutFirstNSymbols(number, 2));
		} catch (OutOfNumberLengthException e) {
			System.out.println(e.getMessage());
		}

	}
	
	/**
	 * Чтобы извлечь из числа n крайних правых цифр
	 * необходимо найти остаток после деления на 10n
	 */
	private static int getLastNSymbols(int data, int symbolCount) throws OutOfNumberLengthException {
		if (Integer.toString(data).length() < symbolCount) throw new OutOfNumberLengthException();
		return (int) (data % Math.pow(10, symbolCount));
	}
	
	/**
	 * Чтобы отбросить из числа n крайниъ правых цифр
	 * необходимо найти результат деления на 10n
	 */
	private static int getWithoutLastNSymbols(int data, int symbolCount) throws OutOfNumberLengthException {
		if (Integer.toString(data).length() < symbolCount) throw new OutOfNumberLengthException();
		return (int) (data / Math.pow(10, symbolCount));
	}
	
	/**
	 * Чтобы извлечь из числа n крайних левых цифр,
	 * необходимо разделить его на 10^(N-n)
	 */
	private static int getFirstNSymbols(int data, int symbolCount) throws OutOfNumberLengthException {
		int N = Integer.toString(data).length();
		if (N < symbolCount) throw new OutOfNumberLengthException();
		return (int) (data / Math.pow(10, N-symbolCount));
	}
	
	/**
	 * Чтобы отбросить из числа n крайних левых цифр,
	 * нужно найти остаток после деления на 10^(N-n)
	 */
	private static int getWithoutFirstNSymbols(int data, int symbolCount) throws OutOfNumberLengthException {
		int N = Integer.toString(data).length();
		if (N < symbolCount) throw new OutOfNumberLengthException();
		return (int) (data % Math.pow(10, N-symbolCount));
	}
} 
