package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Volador implements IAcuatico{

	private Double profundidad;
	HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0;
		
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
		
	}

}
