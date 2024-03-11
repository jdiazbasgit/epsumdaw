package epsum.daw.basedatos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datos_laborales")
public class DatoLaboral {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int salario;

	@ManyToOne
	private Cargo micargo;

	public DatoLaboral(int id, int salario, Cargo micargo) {
		super();
		this.id = id;
		this.salario = salario;
		this.micargo = micargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Cargo getMicargo() {
		return micargo;
	}

	public void setMicargo(Cargo micargo) {
		this.micargo = micargo;
	}

}
