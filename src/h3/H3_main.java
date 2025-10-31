package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int i = 250;
		int j = 175;
		int k = 10;
		
		boolean a;
		a = (i > j);
		boolean b;
		b = (i > 200);
		boolean c;
		c = (j > 100);
		
		if (a && !b && !c) {
			k = 1;
		}
		else if (a && b && !c) {
			k = 2;
		}
		else if (a && b && c) {
			k = 3;
		}
		else if (!a && !b && !c) {
			k = 4;
		}
		else {
			k = -10;
		}
		
		System.out.println("k beträgt nun folgenden Wert: " +k );
		
	}

}
