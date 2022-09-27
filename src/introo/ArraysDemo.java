package introo;

public class ArraysDemo {

	public static void main(String[] args) {
		String öğrenci1 = "Engin";
		String öğrenci2 = "Ayşe";
		String öğrenci3 = "Ahmet";

		System.out.println(öğrenci1);
		System.out.println(öğrenci2);
		System.out.println(öğrenci3);
		
	System.out.println("---------------------------");
	
		String[] öğrenciler = new String[3];
		öğrenciler[0] = "Engin";
		öğrenciler[1] = "Ayşe";
		öğrenciler[2] = "Ahmet";

		for (int i = 0; i < öğrenciler.length; i++) {
			;
		System.out.println(öğrenciler[i]);
		}

	}

}
