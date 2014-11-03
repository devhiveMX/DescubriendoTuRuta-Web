package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TtrRoutesRecord generated by hbm2java
 */
@Entity
@Table(name = "ttr_routes_record", catalog = "rutadb")
public class TtrRoutesRecord implements java.io.Serializable {

	private Integer recordId;
	private String origenX;
	private String origenY;
	private Long origenSource;
	private Long origenTarget;
	private String origenDesc;
	private Integer origenIdtramo;
	private String destinoX;
	private String destinoY;
	private Long destinoSource;
	private Long destinoTarget;
	private String destinoDesc;
	private Integer destinoIdtramo;
	private Integer tipoRuta;
	private Boolean opcionCaseta;
	private Boolean opcionAlerta;
	private Integer vehiculoTipo;
	private Integer vehiculoSubtipo;
	private BigDecimal vehiculoRendimiento;
	private BigDecimal vehiculoCostoltgas;
	private Integer cantidadConsultas;

	public TtrRoutesRecord() {
	}

	public TtrRoutesRecord(String origenX, String origenY, Long origenSource,
			Long origenTarget, String origenDesc, Integer origenIdtramo,
			String destinoX, String destinoY, Long destinoSource,
			Long destinoTarget, String destinoDesc, Integer destinoIdtramo,
			Integer tipoRuta, Boolean opcionCaseta, Boolean opcionAlerta,
			Integer vehiculoTipo, Integer vehiculoSubtipo,
			BigDecimal vehiculoRendimiento, BigDecimal vehiculoCostoltgas,
			Integer cantidadConsultas) {
		this.origenX = origenX;
		this.origenY = origenY;
		this.origenSource = origenSource;
		this.origenTarget = origenTarget;
		this.origenDesc = origenDesc;
		this.origenIdtramo = origenIdtramo;
		this.destinoX = destinoX;
		this.destinoY = destinoY;
		this.destinoSource = destinoSource;
		this.destinoTarget = destinoTarget;
		this.destinoDesc = destinoDesc;
		this.destinoIdtramo = destinoIdtramo;
		this.tipoRuta = tipoRuta;
		this.opcionCaseta = opcionCaseta;
		this.opcionAlerta = opcionAlerta;
		this.vehiculoTipo = vehiculoTipo;
		this.vehiculoSubtipo = vehiculoSubtipo;
		this.vehiculoRendimiento = vehiculoRendimiento;
		this.vehiculoCostoltgas = vehiculoCostoltgas;
		this.cantidadConsultas = cantidadConsultas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "record_id", unique = true, nullable = false)
	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Column(name = "origen_x", length = 50)
	public String getOrigenX() {
		return this.origenX;
	}

	public void setOrigenX(String origenX) {
		this.origenX = origenX;
	}

	@Column(name = "origen_y", length = 50)
	public String getOrigenY() {
		return this.origenY;
	}

	public void setOrigenY(String origenY) {
		this.origenY = origenY;
	}

	@Column(name = "origen_source")
	public Long getOrigenSource() {
		return this.origenSource;
	}

	public void setOrigenSource(Long origenSource) {
		this.origenSource = origenSource;
	}

	@Column(name = "origen_target")
	public Long getOrigenTarget() {
		return this.origenTarget;
	}

	public void setOrigenTarget(Long origenTarget) {
		this.origenTarget = origenTarget;
	}

	@Column(name = "origen_desc", length = 400)
	public String getOrigenDesc() {
		return this.origenDesc;
	}

	public void setOrigenDesc(String origenDesc) {
		this.origenDesc = origenDesc;
	}

	@Column(name = "origen_idtramo")
	public Integer getOrigenIdtramo() {
		return this.origenIdtramo;
	}

	public void setOrigenIdtramo(Integer origenIdtramo) {
		this.origenIdtramo = origenIdtramo;
	}

	@Column(name = "destino_x", length = 50)
	public String getDestinoX() {
		return this.destinoX;
	}

	public void setDestinoX(String destinoX) {
		this.destinoX = destinoX;
	}

	@Column(name = "destino_y", length = 50)
	public String getDestinoY() {
		return this.destinoY;
	}

	public void setDestinoY(String destinoY) {
		this.destinoY = destinoY;
	}

	@Column(name = "destino_source")
	public Long getDestinoSource() {
		return this.destinoSource;
	}

	public void setDestinoSource(Long destinoSource) {
		this.destinoSource = destinoSource;
	}

	@Column(name = "destino_target")
	public Long getDestinoTarget() {
		return this.destinoTarget;
	}

	public void setDestinoTarget(Long destinoTarget) {
		this.destinoTarget = destinoTarget;
	}

	@Column(name = "destino_desc", length = 400)
	public String getDestinoDesc() {
		return this.destinoDesc;
	}

	public void setDestinoDesc(String destinoDesc) {
		this.destinoDesc = destinoDesc;
	}

	@Column(name = "destino_idtramo")
	public Integer getDestinoIdtramo() {
		return this.destinoIdtramo;
	}

	public void setDestinoIdtramo(Integer destinoIdtramo) {
		this.destinoIdtramo = destinoIdtramo;
	}

	@Column(name = "tipo_ruta")
	public Integer getTipoRuta() {
		return this.tipoRuta;
	}

	public void setTipoRuta(Integer tipoRuta) {
		this.tipoRuta = tipoRuta;
	}

	@Column(name = "opcion_caseta")
	public Boolean getOpcionCaseta() {
		return this.opcionCaseta;
	}

	public void setOpcionCaseta(Boolean opcionCaseta) {
		this.opcionCaseta = opcionCaseta;
	}

	@Column(name = "opcion_alerta")
	public Boolean getOpcionAlerta() {
		return this.opcionAlerta;
	}

	public void setOpcionAlerta(Boolean opcionAlerta) {
		this.opcionAlerta = opcionAlerta;
	}

	@Column(name = "vehiculo_tipo")
	public Integer getVehiculoTipo() {
		return this.vehiculoTipo;
	}

	public void setVehiculoTipo(Integer vehiculoTipo) {
		this.vehiculoTipo = vehiculoTipo;
	}

	@Column(name = "vehiculo_subtipo")
	public Integer getVehiculoSubtipo() {
		return this.vehiculoSubtipo;
	}

	public void setVehiculoSubtipo(Integer vehiculoSubtipo) {
		this.vehiculoSubtipo = vehiculoSubtipo;
	}

	@Column(name = "vehiculo_rendimiento", precision = 10)
	public BigDecimal getVehiculoRendimiento() {
		return this.vehiculoRendimiento;
	}

	public void setVehiculoRendimiento(BigDecimal vehiculoRendimiento) {
		this.vehiculoRendimiento = vehiculoRendimiento;
	}

	@Column(name = "vehiculo_costoltgas", precision = 10)
	public BigDecimal getVehiculoCostoltgas() {
		return this.vehiculoCostoltgas;
	}

	public void setVehiculoCostoltgas(BigDecimal vehiculoCostoltgas) {
		this.vehiculoCostoltgas = vehiculoCostoltgas;
	}

	@Column(name = "cantidad_consultas")
	public Integer getCantidadConsultas() {
		return this.cantidadConsultas;
	}

	public void setCantidadConsultas(Integer cantidadConsultas) {
		this.cantidadConsultas = cantidadConsultas;
	}

}
