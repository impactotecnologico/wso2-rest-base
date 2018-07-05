package net.impactotecnologico.ms.pojo;

public class Curso {

	private String nombre;

	private String fecha;

	private int duracion;

	public Curso(String nombre, String fecha, int duracion) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracion = duracion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion
	 *            the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion + "]";
	}

}
