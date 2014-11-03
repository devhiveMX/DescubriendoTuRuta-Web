package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TtrContenido generated by hbm2java
 */
@Entity
@Table(name = "ttr_contenido", catalog = "rutadb")
public class TtrContenido implements java.io.Serializable {

	private int idContenido;
	private String titulo;
	private String contenido;
	private Date creadoEl;
	private Date modificadoEl;
	private String modificadoPor;
	private String codigo;

	public TtrContenido() {
	}

	public TtrContenido(int idContenido, String titulo, String contenido) {
		this.idContenido = idContenido;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public TtrContenido(int idContenido, String titulo, String contenido,
			Date creadoEl, Date modificadoEl, String modificadoPor,
			String codigo) {
		this.idContenido = idContenido;
		this.titulo = titulo;
		this.contenido = contenido;
		this.creadoEl = creadoEl;
		this.modificadoEl = modificadoEl;
		this.modificadoPor = modificadoPor;
		this.codigo = codigo;
	}

	@Id
	@Column(name = "id_contenido", unique = true, nullable = false)
	public int getIdContenido() {
		return this.idContenido;
	}

	public void setIdContenido(int idContenido) {
		this.idContenido = idContenido;
	}

	@Column(name = "titulo", nullable = false, length = 25)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "contenido", nullable = false, length = 3500)
	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creado_el", length = 0)
	public Date getCreadoEl() {
		return this.creadoEl;
	}

	public void setCreadoEl(Date creadoEl) {
		this.creadoEl = creadoEl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modificado_el", length = 0)
	public Date getModificadoEl() {
		return this.modificadoEl;
	}

	public void setModificadoEl(Date modificadoEl) {
		this.modificadoEl = modificadoEl;
	}

	@Column(name = "modificado_por", length = 50)
	public String getModificadoPor() {
		return this.modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	@Column(name = "codigo", length = 25)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
