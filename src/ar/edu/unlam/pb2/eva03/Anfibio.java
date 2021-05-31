package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements ITerrestre, IAcuatico{

		private Double velocidad;
		private Double profundidad;
		
	Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0;
		this.velocidad=0.0;
		
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
		
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
