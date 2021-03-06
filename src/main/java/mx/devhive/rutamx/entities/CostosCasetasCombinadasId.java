package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CostosCasetasCombinadasId generated by hbm2java
 */
@Embeddable
public class CostosCasetasCombinadasId implements java.io.Serializable {

	private String idEntrada;
	private String idSalida;
	private String tipo;
	private String tramo;
	private String longKm;
	private String vigenteDesde;
	private String motos;
	private String auto;
	private String ab2ejes;
	private String ab3ejes;
	private String ab4ejes;
	private String cm2ejes;
	private String cm3ejes;
	private String cm4ejes;
	private String cm5ejes;
	private String cm6ejes;
	private String cm7ejes;
	private String cm8ejes;
	private String cm9ejes;

	public CostosCasetasCombinadasId() {
	}

	public CostosCasetasCombinadasId(String idEntrada, String idSalida,
			String tipo, String tramo, String longKm, String vigenteDesde,
			String motos, String auto, String ab2ejes, String ab3ejes,
			String ab4ejes, String cm2ejes, String cm3ejes, String cm4ejes,
			String cm5ejes, String cm6ejes, String cm7ejes, String cm8ejes,
			String cm9ejes) {
		this.idEntrada = idEntrada;
		this.idSalida = idSalida;
		this.tipo = tipo;
		this.tramo = tramo;
		this.longKm = longKm;
		this.vigenteDesde = vigenteDesde;
		this.motos = motos;
		this.auto = auto;
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
	}

	@Column(name = "id_entrada", length = 4)
	public String getIdEntrada() {
		return this.idEntrada;
	}

	public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}

	@Column(name = "id_salida", length = 4)
	public String getIdSalida() {
		return this.idSalida;
	}

	public void setIdSalida(String idSalida) {
		this.idSalida = idSalida;
	}

	@Column(name = "tipo", length = 60)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "tramo", length = 59)
	public String getTramo() {
		return this.tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

	@Column(name = "long_km", length = 8)
	public String getLongKm() {
		return this.longKm;
	}

	public void setLongKm(String longKm) {
		this.longKm = longKm;
	}

	@Column(name = "vigente_desde", length = 14)
	public String getVigenteDesde() {
		return this.vigenteDesde;
	}

	public void setVigenteDesde(String vigenteDesde) {
		this.vigenteDesde = vigenteDesde;
	}

	@Column(name = "motos", length = 6)
	public String getMotos() {
		return this.motos;
	}

	public void setMotos(String motos) {
		this.motos = motos;
	}

	@Column(name = "auto", length = 6)
	public String getAuto() {
		return this.auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	@Column(name = "ab2ejes", length = 9)
	public String getAb2ejes() {
		return this.ab2ejes;
	}

	public void setAb2ejes(String ab2ejes) {
		this.ab2ejes = ab2ejes;
	}

	@Column(name = "ab3ejes", length = 9)
	public String getAb3ejes() {
		return this.ab3ejes;
	}

	public void setAb3ejes(String ab3ejes) {
		this.ab3ejes = ab3ejes;
	}

	@Column(name = "ab4ejes", length = 9)
	public String getAb4ejes() {
		return this.ab4ejes;
	}

	public void setAb4ejes(String ab4ejes) {
		this.ab4ejes = ab4ejes;
	}

	@Column(name = "cm2ejes", length = 9)
	public String getCm2ejes() {
		return this.cm2ejes;
	}

	public void setCm2ejes(String cm2ejes) {
		this.cm2ejes = cm2ejes;
	}

	@Column(name = "cm3ejes", length = 9)
	public String getCm3ejes() {
		return this.cm3ejes;
	}

	public void setCm3ejes(String cm3ejes) {
		this.cm3ejes = cm3ejes;
	}

	@Column(name = "cm4ejes", length = 9)
	public String getCm4ejes() {
		return this.cm4ejes;
	}

	public void setCm4ejes(String cm4ejes) {
		this.cm4ejes = cm4ejes;
	}

	@Column(name = "cm5ejes", length = 9)
	public String getCm5ejes() {
		return this.cm5ejes;
	}

	public void setCm5ejes(String cm5ejes) {
		this.cm5ejes = cm5ejes;
	}

	@Column(name = "cm6ejes", length = 9)
	public String getCm6ejes() {
		return this.cm6ejes;
	}

	public void setCm6ejes(String cm6ejes) {
		this.cm6ejes = cm6ejes;
	}

	@Column(name = "cm7ejes", length = 9)
	public String getCm7ejes() {
		return this.cm7ejes;
	}

	public void setCm7ejes(String cm7ejes) {
		this.cm7ejes = cm7ejes;
	}

	@Column(name = "cm8ejes", length = 9)
	public String getCm8ejes() {
		return this.cm8ejes;
	}

	public void setCm8ejes(String cm8ejes) {
		this.cm8ejes = cm8ejes;
	}

	@Column(name = "cm9ejes", length = 9)
	public String getCm9ejes() {
		return this.cm9ejes;
	}

	public void setCm9ejes(String cm9ejes) {
		this.cm9ejes = cm9ejes;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CostosCasetasCombinadasId))
			return false;
		CostosCasetasCombinadasId castOther = (CostosCasetasCombinadasId) other;

		return ((this.getIdEntrada() == castOther.getIdEntrada()) || (this
				.getIdEntrada() != null && castOther.getIdEntrada() != null && this
				.getIdEntrada().equals(castOther.getIdEntrada())))
				&& ((this.getIdSalida() == castOther.getIdSalida()) || (this
						.getIdSalida() != null
						&& castOther.getIdSalida() != null && this
						.getIdSalida().equals(castOther.getIdSalida())))
				&& ((this.getTipo() == castOther.getTipo()) || (this.getTipo() != null
						&& castOther.getTipo() != null && this.getTipo()
						.equals(castOther.getTipo())))
				&& ((this.getTramo() == castOther.getTramo()) || (this
						.getTramo() != null && castOther.getTramo() != null && this
						.getTramo().equals(castOther.getTramo())))
				&& ((this.getLongKm() == castOther.getLongKm()) || (this
						.getLongKm() != null && castOther.getLongKm() != null && this
						.getLongKm().equals(castOther.getLongKm())))
				&& ((this.getVigenteDesde() == castOther.getVigenteDesde()) || (this
						.getVigenteDesde() != null
						&& castOther.getVigenteDesde() != null && this
						.getVigenteDesde().equals(castOther.getVigenteDesde())))
				&& ((this.getMotos() == castOther.getMotos()) || (this
						.getMotos() != null && castOther.getMotos() != null && this
						.getMotos().equals(castOther.getMotos())))
				&& ((this.getAuto() == castOther.getAuto()) || (this.getAuto() != null
						&& castOther.getAuto() != null && this.getAuto()
						.equals(castOther.getAuto())))
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
						.getCm9ejes().equals(castOther.getCm9ejes())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdEntrada() == null ? 0 : this.getIdEntrada().hashCode());
		result = 37 * result
				+ (getIdSalida() == null ? 0 : this.getIdSalida().hashCode());
		result = 37 * result
				+ (getTipo() == null ? 0 : this.getTipo().hashCode());
		result = 37 * result
				+ (getTramo() == null ? 0 : this.getTramo().hashCode());
		result = 37 * result
				+ (getLongKm() == null ? 0 : this.getLongKm().hashCode());
		result = 37
				* result
				+ (getVigenteDesde() == null ? 0 : this.getVigenteDesde()
						.hashCode());
		result = 37 * result
				+ (getMotos() == null ? 0 : this.getMotos().hashCode());
		result = 37 * result
				+ (getAuto() == null ? 0 : this.getAuto().hashCode());
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
		return result;
	}

}
