package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 2;
		int j = 4;
		int k = 10;
		int max;
		int min;
		
		if (i < k && i < j) {
			min = i;
		}
		else if (j < i && j < k) {
			min = j;
		}
		else {
			min = k;
		}

		if (i > j && i > j) {
			max = i;
		}
		else if (j > i && j > k) {
			max = j;
		}
		else {
			max = k;
		}
		
		System.out.println("Der größte Wert ergibt: " + max );
		System.out.println("Der kleinste Wert ergibt: " + min );
	}

}
