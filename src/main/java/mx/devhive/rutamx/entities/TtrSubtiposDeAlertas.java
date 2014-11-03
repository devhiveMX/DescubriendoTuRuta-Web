package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TtrSubtiposDeAlertas generated by hbm2java
 */
@Entity
@Table(name = "ttr_subtipos_de_alertas", catalog = "rutadb")
public class TtrSubtiposDeAlertas implements java.io.Serializable {

	private Integer subtipoDeAlertaId;
	private TtrTiposDeAlertas ttrTiposDeAlertas;
	private String subtipoDeAlerta;

	public TtrSubtiposDeAlertas() {
	}

	public TtrSubtiposDeAlertas(TtrTiposDeAlertas ttrTiposDeAlertas,
			String subtipoDeAlerta) {
		this.ttrTiposDeAlertas = ttrTiposDeAlertas;
		this.subtipoDeAlerta = subtipoDeAlerta;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "subtipo_de_alerta_id", unique = true, nullable = false)
	public Integer getSubtipoDeAlertaId() {
		return this.subtipoDeAlertaId;
	}

	public void setSubtipoDeAlertaId(Integer subtipoDeAlertaId) {
		this.subtipoDeAlertaId = subtipoDeAlertaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_de_alerta_id", nullable = false)
	public TtrTiposDeAlertas getTtrTiposDeAlertas() {
		return this.ttrTiposDeAlertas;
	}

	public void setTtrTiposDeAlertas(TtrTiposDeAlertas ttrTiposDeAlertas) {
		this.ttrTiposDeAlertas = ttrTiposDeAlertas;
	}

	@Column(name = "subtipo_de_alerta", nullable = false)
	public String getSubtipoDeAlerta() {
		return this.subtipoDeAlerta;
	}

	public void setSubtipoDeAlerta(String subtipoDeAlerta) {
		this.subtipoDeAlerta = subtipoDeAlerta;
	}

}
