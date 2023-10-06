package unidad9;

public class main_app {
	public static void main(String[] args) {
		Electrodomestico arr[] = new Electrodomestico[10];
		
		Lavadora a = new Lavadora(3.9,"blanco",'A', 2.5);
		Televisor b = new Televisor(4, "negro", 'A', 6,true,30);
		
		for (int i = 0; i<arr.length;i++) {
			arr[i] = b;
			if (i>4) {
				arr[i] = a;
			}
		}
		
		
		double totalLavadora = 0;
		double totalTelevision = 0;
		
		for (int i = 0; i<arr.length;i++) {
			if (arr[i] instanceof Televisor) {
				totalTelevision = totalTelevision + arr[i].precioFinal();
			}
			else {
				totalLavadora = totalLavadora + arr[i].precioFinal();
			}
		}
		
		System.out.println("Total lavadora: " + totalLavadora );
		System.out.println("Total televisor: " + totalTelevision );
		System.out.println("Total: " + (totalLavadora + totalTelevision));
	}
	

}
