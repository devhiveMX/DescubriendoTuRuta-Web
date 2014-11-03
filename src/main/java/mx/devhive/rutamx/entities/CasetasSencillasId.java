package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CasetasSencillasId generated by hbm2java
 */
@Embeddable
public class CasetasSencillasId implements java.io.Serializable {

	private String coordX;
	private String coordY;
	private int idCaseta;
	private String nombre;
	private String via;
	private BigDecimal longKm;
	private String km;
	private String vigenteDe;
	private Integer motos;
	private Integer autos;
	private Integer ab2ejes;
	private Integer ab3ejes;
	private Integer ab4ejes;
	private Integer cm2ejes;
	private Integer cm3ejes;
	private Integer cm4ejes;
	private Integer cm5ejes;
	private Integer cm6ejes;
	private Integer cm7ejes;
	private Integer cm8ejes;
	private Integer cm9ejes;
	private Date vigenciaTarifa;
	private Double x;
	private BigDecimal y;

	public CasetasSencillasId() {
	}

	public CasetasSencillasId(int idCaseta) {
		this.idCaseta = idCaseta;
	}

	public CasetasSencillasId(String coordX, String coordY, int idCaseta,
			String nombre, String via, BigDecimal longKm, String km,
			String vigenteDe, Integer motos, Integer autos, Integer ab2ejes,
			Integer ab3ejes, Integer ab4ejes, Integer cm2ejes, Integer cm3ejes,
			Integer cm4ejes, Integer cm5ejes, Integer cm6ejes, Integer cm7ejes,
			Integer cm8ejes, Integer cm9ejes, Date vigenciaTarifa, Double x,
			BigDecimal y) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.idCaseta = idCaseta;
		this.nombre = nombre;
		this.via = via;
		this.longKm = longKm;
		this.km = km;
		this.vigenteDe = vigenteDe;
		this.motos = motos;
		this.autos = autos;
		this.ab2ejes = ab2ejes;
		this.ab3ejes = ab3ejes;
		this.ab4ejes = ab4ejes;
		this.cm2ejes = cm2ejes;
		this.cm3ejes = cm3ejes;
		this.cm4ejes = cm4ejes;
		this.cm5ejes = cm5ejes;
		this.cm6ejes = cm6ejes;
		this.cm7ejes = cm7ejes;
		this.cm8ejes = cm8ejes;
		this.cm9ejes = cm9ejes;
		this.vigenciaTarifa = vigenciaTarifa;
		this.x = x;
		this.y = y;
	}

	@Column(name = "coord_x", length = 50)
	public String getCoordX() {
		return this.coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	@Column(name = "coord_y", length = 50)
	public String getCoordY() {
		return this.coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	@Column(name = "id_caseta", nullable = false)
	public int getIdCaseta() {
		return this.idCaseta;
	}

	public void setIdCaseta(int idCaseta) {
		this.idCaseta = idCaseta;
	}

	@Column(name = "nombre", length = 150)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "via", length = 150)
	public String getVia() {
		return this.via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	@Column(name = "long_km", precision = 8, scale = 3)
	public BigDecimal getLongKm() {
		return this.longKm;
	}

	public void setLongKm(BigDecimal longKm) {
		this.longKm = longKm;
	}

	@Column(name = "km", length = 50)
	public String getKm() {
		return this.km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	@Column(name = "vigente_de", length = 2047)
	public String getVigenteDe() {
		return this.vigenteDe;
	}

	public void setVigenteDe(String vigenteDe) {
		this.vigenteDe = vigenteDe;
	}

	@Column(name = "motos")
	public Integer getMotos() {
		return this.motos;
	}

	public void setMotos(Integer motos) {
		this.motos = motos;
	}

	@Column(name = "autos")
	public Integer getAutos() {
		return this.autos;
	}

	public void setAutos(Integer autos) {
		this.autos = autos;
	}

	@Column(name = "ab2ejes")
	public Integer getAb2ejes() {
		return this.ab2ejes;
	}

	public void setAb2ejes(Integer ab2ejes) {
		this.ab2ejes = ab2ejes;
	}

	@Column(name = "ab3ejes")
	public Integer getAb3ejes() {
		return this.ab3ejes;
	}

	public void setAb3ejes(Integer ab3ejes) {
		this.ab3ejes = ab3ejes;
	}

	@Column(name = "ab4ejes")
	public Integer getAb4ejes() {
		return this.ab4ejes;
	}

	public void setAb4ejes(Integer ab4ejes) {
		this.ab4ejes = ab4ejes;
	}

	@Column(name = "cm2ejes")
	public Integer getCm2ejes() {
		return this.cm2ejes;
	}

	public void setCm2ejes(Integer cm2ejes) {
		this.cm2ejes = cm2ejes;
	}

	@Column(name = "cm3ejes")
	public Integer getCm3ejes() {
		return this.cm3ejes;
	}

	public void setCm3ejes(Integer cm3ejes) {
		this.cm3ejes = cm3ejes;
	}

	@Column(name = "cm4ejes")
	public Integer getCm4ejes() {
		return this.cm4ejes;
	}

	public void setCm4ejes(Integer cm4ejes) {
		this.cm4ejes = cm4ejes;
	}

	@Column(name = "cm5ejes")
	public Integer getCm5ejes() {
		return this.cm5ejes;
	}

	public void setCm5ejes(Integer cm5ejes) {
		this.cm5ejes = cm5ejes;
	}

	@Column(name = "cm6ejes")
	public Integer getCm6ejes() {
		return this.cm6ejes;
	}

	public void setCm6ejes(Integer cm6ejes) {
		this.cm6ejes = cm6ejes;
	}

	@Column(name = "cm7ejes")
	public Integer getCm7ejes() {
		return this.cm7ejes;
	}

	public void setCm7ejes(Integer cm7ejes) {
		this.cm7ejes = cm7ejes;
	}

	@Column(name = "cm8ejes")
	public Integer getCm8ejes() {
		return this.cm8ejes;
	}

	public void setCm8ejes(Integer cm8ejes) {
		this.cm8ejes = cm8ejes;
	}

	@Column(name = "cm9ejes")
	public Integer getCm9ejes() {
		return this.cm9ejes;
	}

	public void setCm9ejes(Integer cm9ejes) {
		this.cm9ejes = cm9ejes;
	}

	@Column(name = "vigencia_tarifa", length = 0)
	public Date getVigenciaTarifa() {
		return this.vigenciaTarifa;
	}

	public void setVigenciaTarifa(Date vigenciaTarifa) {
		this.vigenciaTarifa = vigenciaTarifa;
	}

	@Column(name = "x", precision = 22, scale = 0)
	public Double getX() {
		return this.x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	@Column(name = "y", precision = 13, scale = 8)
	public BigDecimal getY() {
		return this.y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CasetasSencillasId))
			return false;
		CasetasSencillasId castOther = (CasetasSencillasId) other;

		return ((this.getCoordX() == castOther.getCoordX()) || (this
				.getCoordX() != null && castOther.getCoordX() != null && this
				.getCoordX().equals(castOther.getCoordX())))
				&& ((this.getCoordY() == castOther.getCoordY()) || (this
						.getCoordY() != null && castOther.getCoordY() != null && this
						.getCoordY().equals(castOther.getCoordY())))
				&& (this.getIdCaseta() == castOther.getIdCaseta())
				&& ((this.getNombre() == castOther.getNombre()) || (this
						.getNombre() != null && castOther.getNombre() != null && this
						.getNombre().equals(castOther.getNombre())))
				&& ((this.getVia() == castOther.getVia()) || (this.getVia() != null
						&& castOther.getVia() != null && this.getVia().equals(
						castOther.getVia())))
				&& ((this.getLongKm() == castOther.getLongKm()) || (this
						.getLongKm() != null && castOther.getLongKm() != null && this
						.getLongKm().equals(castOther.getLongKm())))
				&& ((this.getKm() == castOther.getKm()) || (this.getKm() != null
						&& castOther.getKm() != null && this.getKm().equals(
						castOther.getKm())))
				&& ((this.getVigenteDe() == castOther.getVigenteDe()) || (this
						.getVigenteDe() != null
						&& castOther.getVigenteDe() != null && this
						.getVigenteDe().equals(castOther.getVigenteDe())))
				&& ((this.getMotos() == castOther.getMotos()) || (this
						.getMotos() != null && castOther.getMotos() != null && this
						.getMotos().equals(castOther.getMotos())))
				&& ((this.getAutos() == castOther.getAutos()) || (this
						.getAutos() != null && castOther.getAutos() != null && this
						.getAutos().equals(castOther.getAutos())))
				&& ((this.getAb2ejes() == castOther.getAb2ejes()) || (this
						.getAb2ejes() != null && castOther.getAb2ejes() != null && this
						.getAb2ejes().equals(castOther.getAb2ejes())))
				&& ((this.getAb3ejes() == castOther.getAb3ejes()) || (this
						.getAb3ejes() != null && castOther.getAb3ejes() != null && this
						.getAb3ejes().equals(castOther.getAb3ejes())))
				&& ((this.getAb4ejes() == castOther.getAb4ejes()) || (this
						.getAb4ejes() != null && castOther.getAb4ejes() != null && this
						.getAb4ejes().equals(castOther.getAb4ejes())))
				&& ((this.getCm2ejes() == castOther.getCm2ejes()) || (this
						.getCm2ejes() != null && castOther.getCm2ejes() != null && this
						.getCm2ejes().equals(castOther.getCm2ejes())))
				&& ((this.getCm3ejes() == castOther.getCm3ejes()) || (this
						.getCm3ejes() != null && castOther.getCm3ejes() != null && this
						.getCm3ejes().equals(castOther.getCm3ejes())))
				&& ((this.getCm4ejes() == castOther.getCm4ejes()) || (this
						.getCm4ejes() != null && castOther.getCm4ejes() != null && this
						.getCm4ejes().equals(castOther.getCm4ejes())))
				&& ((this.getCm5ejes() == castOther.getCm5ejes()) || (this
						.getCm5ejes() != null && castOther.getCm5ejes() != null && this
						.getCm5ejes().equals(castOther.getCm5ejes())))
				&& ((this.getCm6ejes() == castOther.getCm6ejes()) || (this
						.getCm6ejes() != null && castOther.getCm6ejes() != null && this
						.getCm6ejes().equals(castOther.getCm6ejes())))
				&& ((this.getCm7ejes() == castOther.getCm7ejes()) || (this
						.getCm7ejes() != null && castOther.getCm7ejes() != null && this
						.getCm7ejes().equals(castOther.getCm7ejes())))
				&& ((this.getCm8ejes() == castOther.getCm8ejes()) || (this
						.getCm8ejes() != null && castOther.getCm8ejes() != null && this
						.getCm8ejes().equals(castOther.getCm8ejes())))
				&& ((this.getCm9ejes() == castOther.getCm9ejes()) || (this
						.getCm9ejes() != null && castOther.getCm9ejes() != null && this
						.getCm9ejes().equals(castOther.getCm9ejes())))
				&& ((this.getVigenciaTarifa() == castOther.getVigenciaTarifa()) || (this
						.getVigenciaTarifa() != null
						&& castOther.getVigenciaTarifa() != null && this
						.getVigenciaTarifa().equals(
								castOther.getVigenciaTarifa())))
				&& ((this.getX() == castOther.getX()) || (this.getX() != null
						&& castOther.getX() != null && this.getX().equals(
						castOther.getX())))
				&& ((this.getY() == castOther.getY()) || (this.getY() != null
						&& castOther.getY() != null && this.getY().equals(
						castOther.getY())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCoordX() == null ? 0 : this.getCoordX().hashCode());
		result = 37 * result
				+ (getCoordY() == null ? 0 : this.getCoordY().hashCode());
		result = 37 * result + this.getIdCaseta();
		result = 37 * result
				+ (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result
				+ (getVia() == null ? 0 : this.getVia().hashCode());
		result = 37 * result
				+ (getLongKm() == null ? 0 : this.getLongKm().hashCode());
		result = 37 * result + (getKm() == null ? 0 : this.getKm().hashCode());
		result = 37 * result
				+ (getVigenteDe() == null ? 0 : this.getVigenteDe().hashCode());
		result = 37 * result
				+ (getMotos() == null ? 0 : this.getMotos().hashCode());
		result = 37 * result
				+ (getAutos() == null ? 0 : this.getAutos().hashCode());
		result = 37 * result
				+ (getAb2ejes() == null ? 0 : this.getAb2ejes().hashCode());
		result = 37 * result
				+ (getAb3ejes() == null ? 0 : this.getAb3ejes().hashCode());
		result = 37 * result
				+ (getAb4ejes() == null ? 0 : this.getAb4ejes().hashCode());
		result = 37 * result
				+ (getCm2ejes() == null ? 0 : this.getCm2ejes().hashCode());
		result = 37 * result
				+ (getCm3ejes() == null ? 0 : this.getCm3ejes().hashCode());
		result = 37 * result
				+ (getCm4ejes() == null ? 0 : this.getCm4ejes().hashCode());
		result = 37 * result
				+ (getCm5ejes() == null ? 0 : this.getCm5ejes().hashCode());
		result = 37 * result
				+ (getCm6ejes() == null ? 0 : this.getCm6ejes().hashCode());
		result = 37 * result
				+ (getCm7ejes() == null ? 0 : this.getCm7ejes().hashCode());
		result = 37 * result
				+ (getCm8ejes() == null ? 0 : this.getCm8ejes().hashCode());
		result = 37 * result
				+ (getCm9ejes() == null ? 0 : this.getCm9ejes().hashCode());
		result = 37
				* result
				+ (getVigenciaTarifa() == null ? 0 : this.getVigenciaTarifa()
						.hashCode());
		result = 37 * result + (getX() == null ? 0 : this.getX().hashCode());
		result = 37 * result + (getY() == null ? 0 : this.getY().hashCode());
		return result;
	}

}