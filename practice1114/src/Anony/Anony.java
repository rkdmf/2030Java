package Anony;

public class Anony {
	int field = 1;
	
	void method(final int arg1, final int arg2) {
		final int var1 = 2;
		final int var2 = 3;
		
		//arg1 = 4; final때문에 오류
		//arg2 = 5;
		
		//val1 = 6;
		//var2 = 7;
		
		Calculater c = new Calculater() {
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
	}

}
