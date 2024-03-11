package epsum.daw.basedatos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datos_personales")
public class Dato_personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Estado_civil estado_civil;
	
	@ManyToOne
	private Hijo hijo;

	public Dato_personal(int id, Estado_civil estado_civil, Hijo hijo) {
		super();
		this.id = id;
		this.estado_civil = estado_civil;
		this.hijo = hijo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Estado_civil getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(Estado_civil estado_civil) {
		this.estado_civil = estado_civil;
	}

	public Hijo getHijo() {
		return hijo;
	}

	public void setHijo(Hijo hijo) {
		this.hijo = hijo;
	}
	
	
	

}
