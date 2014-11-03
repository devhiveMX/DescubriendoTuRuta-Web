package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CasetasSencillasNId generated by hbm2java
 */
@Embeddable
public class CasetasSencillasNId implements java.io.Serializable {

	private String idCaseta;
	private String gid;

	public CasetasSencillasNId() {
	}

	public CasetasSencillasNId(String idCaseta, String gid) {
		this.idCaseta = idCaseta;
		this.gid = gid;
	}

	@Column(name = "id_caseta", length = 0)
	public String getIdCaseta() {
		return this.idCaseta;
	}

	public void setIdCaseta(String idCaseta) {
		this.idCaseta = idCaseta;
	}

	@Column(name = "gid", length = 0)
	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CasetasSencillasNId))
			return false;
		CasetasSencillasNId castOther = (CasetasSencillasNId) other;

		return ((this.getIdCaseta() == castOther.getIdCaseta()) || (this
				.getIdCaseta() != null && castOther.getIdCaseta() != null && this
				.getIdCaseta().equals(castOther.getIdCaseta())))
				&& ((this.getGid() == castOther.getGid()) || (this.getGid() != null
						&& castOther.getGid() != null && this.getGid().equals(
						castOther.getGid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdCaseta() == null ? 0 : this.getIdCaseta().hashCode());
		result = 37 * result
				+ (getGid() == null ? 0 : this.getGid().hashCode());
		return result;
	}

}
