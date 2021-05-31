package ar.edu.unlam.pb2.eva03;

public class Volador extends Vehiculo{

	private Double altura;
	
	Volador(Integer codigo, String nombre) {
		super(codigo, nombre);
	 this.altura=0.0;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
