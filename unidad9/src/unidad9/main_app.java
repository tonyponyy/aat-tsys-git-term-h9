package unidad9;

public class main_app {
	public static void main(String[] args) {
		Electrodomestico arr[] = new Electrodomestico[10];
		
		Lavadora a = new Lavadora(3.9, 5, "blanco", 'A', 2.5);
		Television b = new Television(4, 6, "negro", 'A',30,true);
		
		arr[0] = a;
		
		double totalLavadora = 0;
		double totalTelevision = 0;
		
		for (int i = 0; i<arr.length;i++) {
			if (arr[i].isInstance(Lavadora)) {
				
			}
			else {
				
			}
		}
		System.out.println("first commit");

		System.out.println("comentario de Ainara");
		

		//Mi comentario --Sergi
	}
	

}
