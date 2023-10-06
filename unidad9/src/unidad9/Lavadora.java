package unidad9;

public class Lavadora extends Electrodomestico{
	
	private final double CARGA = 5;
	protected double carga;
	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA;
		
	}
	public Lavadora(double precio, String color, char consumo, double peso) {
		super(precio, peso, color, consumo);
		this.carga = CARGA;
	}
	public double getCarga() {
		return carga;
	}
	
	public double getCARGA() {
		return CARGA;
	}
	@Override
	public double precioFinal() {
		double total = 0;
		if (carga<30) {
			total=(total+50);
		}
		return super.precioFinal()+total;
	}
	

}
