package unidad9;

public class Televisor extends Electrodomestico {
	
	protected final boolean SINTONIZADOR_DEFECTO=false;
	protected final int RESOLUCION_DEFECTO=20;
	
	protected int resolucion;
	protected boolean sintonizador;
	
	public Televisor() {
		super();
		this.sintonizador = SINTONIZADOR_DEFECTO;
		this.resolucion = RESOLUCION_DEFECTO;
	}
	
	public Televisor(double precio, double peso) {
		super(precio,peso);
		this.sintonizador = SINTONIZADOR_DEFECTO;
		this.resolucion = RESOLUCION_DEFECTO;
	}
	public Televisor(double precioBase,String color,char consumo,double peso, boolean sintonizador,int resolucion) {
		super(precioBase,peso,color,consumo);
		this.sintonizador = sintonizador;
		this.resolucion = resolucion;
	}

	public int getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizador() {
		return sintonizador;
	}
	
	@Override
	public double precioFinal() {
		double plusPrecio = 0;
		if (resolucion > 40) {
			plusPrecio += (super.getPrecioBase()/100)*30;
		}
		if (sintonizador) {
			plusPrecio +=50;
		}
		return super.precioFinal()+plusPrecio;
	}
	
	
}
