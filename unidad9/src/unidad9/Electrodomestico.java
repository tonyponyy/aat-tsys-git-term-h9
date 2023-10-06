package unidad9;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	private final String COLOR = "blanco";
	private final char CONSUMO = 'F';
	private final int PRECIO_BASE = 100;
	private final int PESO = 5;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double pre, double p) {
		this.precioBase = pre;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = p;
	}
	
	public Electrodomestico(double pre, double p, String color, char con) {
		this.precioBase = pre;
		this.peso = p;
		
		if (comprobarConsumoEnergetico(con))  {
            this.consumo = con;
        } else {
            System.out.println("Consumo no válido. Se establecerá F por defecto.");
            this.consumo = CONSUMO;
        }
		
		if (comprobarColor(color))  {
            this.color = color;
        } else {
            System.out.println("Color no válido. Se establecerá como blanco por defecto.");
            this.color = "blanco";
        }
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' ||letra == 'E' || letra == 'F')  {
            return true;
        } else {
            return false;
        }
	}
	
	private boolean comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris"))  {
            return true;
        } else {
            System.out.println("Color no válido. Se establecerá como blanco por defecto.");
            return false;
        }
	}
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double precioFinal() {
		double precioFinal = this.precioBase;
		if(this.consumo == 'A') { precioFinal = precioFinal + 100; }
		if(this.consumo == 'B') { precioFinal = precioFinal + 80; }
		if(this.consumo == 'C') { precioFinal = precioFinal + 60; }
		if(this.consumo == 'D') { precioFinal = precioFinal + 50; }
		if(this.consumo == 'E') { precioFinal = precioFinal + 30; }
		if(this.consumo == 'F') { precioFinal = precioFinal + 10; }
		
		if(this.peso >) { precioFinal = precioFinal + 100; }
	}
	
}
