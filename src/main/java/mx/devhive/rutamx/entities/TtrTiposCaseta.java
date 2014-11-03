package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TtrTiposCaseta generated by hbm2java
 */
@Entity
@Table(name = "ttr_tipos_caseta", catalog = "rutadb")
public class TtrTiposCaseta implements java.io.Serializable {

	private Integer idTipoCaseta;
	private String nombre;
	private Date creadoEl;
	private Date modificadoEl;
	private String modificadoPor;

	public TtrTiposCaseta() {
	}

	public TtrTiposCaseta(String nombre, Date creadoEl, Date modificadoEl,
			String modificadoPor) {
		this.nombre = nombre;
		this.creadoEl = creadoEl;
		this.modificadoEl = modificadoEl;
		this.modificadoPor = modificadoPor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tipo_caseta", unique = true, nullable = false)
	public Integer getIdTipoCaseta() {
		return this.idTipoCaseta;
	}

	public void setIdTipoCaseta(Integer idTipoCaseta) {
		this.idTipoCaseta = idTipoCaseta;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

}
