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
 * TtrRoles generated by hbm2java
 */
@Entity
@Table(name = "ttr_roles", catalog = "rutadb")
public class TtrRoles implements java.io.Serializable {

	private Integer rolId;
	private String rol;
	private Date creadoEl;
	private Date modificadoEl;
	private String modificadoPor;

	public TtrRoles() {
	}

	public TtrRoles(String rol, Date creadoEl, Date modificadoEl,
			String modificadoPor) {
		this.rol = rol;
		this.creadoEl = creadoEl;
		this.modificadoEl = modificadoEl;
		this.modificadoPor = modificadoPor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rol_id", unique = true, nullable = false)
	public Integer getRolId() {
		return this.rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	@Column(name = "rol", length = 30)
	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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
