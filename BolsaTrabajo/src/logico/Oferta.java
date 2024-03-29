package logico;

import java.util.ArrayList;
import java.util.Date;

public class Oferta extends Solicitud {

	private int cantVacantes;
	private String ofertaLaboral;
	private String nivelEstudioReq;
	private String jornada;
	private int salario;
	private String tipoContrato;
	private String periodoCobro;
	private CentroEmpleador miCentro;
	private ArrayList<Postulacion> misPostulaciones;
	private int porcientoMatch;
	private int annosExperiencia;
	private String habilidadRequerida;
	private int cantidadContratados=0;
	private boolean viajar;
	private boolean vehiculo;
	
	public Oferta(String codigo, String categoriaLaboral,String ofertaLaboral,String nivelEstudioReq, String provincia, Date fechaVencimiento, int cantVacantes, String jornada, int salario, String tipoContrato, String periodoCobro, CentroEmpleador miCentro, String estado,int porcientoMatch,int annosExperiencia,String habilidadRequerida,boolean viajar,boolean vehiculo) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento,estado);
		this.annosExperiencia=annosExperiencia;
		this.viajar=viajar;
		this.vehiculo=vehiculo;
		this.habilidadRequerida=habilidadRequerida;
		this.cantVacantes=cantVacantes;
		this.ofertaLaboral=ofertaLaboral;
		this.nivelEstudioReq=nivelEstudioReq;
		this.jornada=jornada;
		this.salario=salario;
		this.tipoContrato=tipoContrato;
		this.periodoCobro=periodoCobro;
		this.miCentro=miCentro;
		this.misPostulaciones=new ArrayList<Postulacion>();
		this.porcientoMatch=porcientoMatch;
		this.cantidadContratados=0;
	}

	public int getCantVacantes() {
		return cantVacantes;
	}
	public void aumentarContratados(){
		cantidadContratados++;
	}

	public int getCantidadContratados() {
		return cantidadContratados;
	}

	public String getNivelEstudioReq() {
		return nivelEstudioReq;
	}

	public String getJornada() {
		return jornada;
	}

	public int getSalario() {
		return salario;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public String getPeriodoCobro() {
		return periodoCobro;
	}

	public CentroEmpleador getMiCentro() {
		return miCentro;
	}

	public ArrayList<Postulacion> getMisPostulaciones() {
		return misPostulaciones;
	}

	public int getPorcientoMatch() {
		return porcientoMatch;
	}

	public String getOfertaLaboral() {
		return ofertaLaboral;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}

	public String getHabilidadRequerida() {
		return habilidadRequerida;
	}
	
	public void disminuirCantVacantes() {
		cantVacantes--;
	}

	public boolean isViajar() {
		return viajar;
	}

	public boolean isVehiculo() {
		return vehiculo;
	}
	

}
