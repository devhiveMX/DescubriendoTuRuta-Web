package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TtrAodTipoGeometrias generated by hbm2java
 */
@Entity
@Table(name = "ttr_aod_tipo_geometrias", catalog = "rutadb")
public class TtrAodTipoGeometrias implements java.io.Serializable {

	private int idTipoGeometria;
	private String nombre;
	private Set<TtrAodAmbitoBusqueda> ttrAodAmbitoBusquedas = new HashSet<TtrAodAmbitoBusqueda>(
			0);

	public TtrAodTipoGeometrias() {
	}

	public TtrAodTipoGeometrias(int idTipoGeometria) {
		this.idTipoGeometria = idTipoGeometria;
	}

	public TtrAodTipoGeometrias(int idTipoGeometria, String nombre,
			Set<TtrAodAmbitoBusqueda> ttrAodAmbitoBusquedas) {
		this.idTipoGeometria = idTipoGeometria;
		this.nombre = nombre;
		this.ttrAodAmbitoBusquedas = ttrAodAmbitoBusquedas;
	}

	@Id
	@Column(name = "id_tipo_geometria", unique = true, nullable = false)
	public int getIdTipoGeometria() {
		return this.idTipoGeometria;
	}

	public void setIdTipoGeometria(int idTipoGeometria) {
		this.idTipoGeometria = idTipoGeometria;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ttrAodTipoGeometrias")
	public Set<TtrAodAmbitoBusqueda> getTtrAodAmbitoBusquedas() {
		return this.ttrAodAmbitoBusquedas;
	}

	public void setTtrAodAmbitoBusquedas(
			Set<TtrAodAmbitoBusqueda> ttrAodAmbitoBusquedas) {
		this.ttrAodAmbitoBusquedas = ttrAodAmbitoBusquedas;
	}

}