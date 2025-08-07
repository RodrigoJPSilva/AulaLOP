package desafioRetangulo;

public class Retangulo {
	public double area;
	public double base;
	public double alt;
	
	public double calcArea() {
		area = base * alt;
		return area;
	}

	@Override
	public String toString() {
		return "Triangulos [area=" + area + ", base=" + base + ", alt=" + alt + "]";
	}
	
}
