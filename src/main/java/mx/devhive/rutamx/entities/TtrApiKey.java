package mx.devhive.rutamx.entities;

// Generated 29/10/2014 12:40:55 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TtrApiKey generated by hbm2java
 */
@Entity
@Table(name = "ttr_api_key", catalog = "rutadb")
public class TtrApiKey implements java.io.Serializable {

	private Integer id;
	private String uid;
	private String key;
	private String domainAllowed;

	public TtrApiKey() {
	}

	public TtrApiKey(String uid, String key, String domainAllowed) {
		this.uid = uid;
		this.key = key;
		this.domainAllowed = domainAllowed;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "uid", nullable = false, length = 100)
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Column(name = "key", nullable = false, length = 100)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "domain_allowed", nullable = false, length = 1000)
	public String getDomainAllowed() {
		return this.domainAllowed;
	}

	public void setDomainAllowed(String domainAllowed) {
		this.domainAllowed = domainAllowed;
	}

}