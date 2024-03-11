package epsum.daw.basedatos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="datos_laborales")
public class Dato_laboral {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int salario;
	
	@ManyToOne
	private Cargo micargo;

	public Dato_laboral(int id, int salario, Cargo micargo) {
		super();
		this.id = id;
		this.salario = salario;
		this.micargo = micargo;
	}
	
	
	
	

}

