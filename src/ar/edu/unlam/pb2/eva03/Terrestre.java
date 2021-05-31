package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo implements ITerrestre{
	
		private Double velocidad;
	
	Terrestre(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad=0.0;
		
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
		
	}

	
}
