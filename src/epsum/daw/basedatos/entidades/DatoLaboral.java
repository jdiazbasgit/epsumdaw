package epsum.daw.basedatos.entidades;

<<<<<<< HEAD
=======

>>>>>>> 1f876e001e40725c29fe64fb7e2d92e0175f5e5b
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

<<<<<<< HEAD
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
=======
@Entity //soy una entidad
@Table(name="datos_laborales")
public class DatoLaboral {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private int salario;
	@ManyToOne
	private Cargo cargo;
	public DatoLaboral(int id, int salario, Cargo cargo) {
		super();
		this.id = id;
		this.salario = salario;
		this.cargo = cargo;
>>>>>>> 1f876e001e40725c29fe64fb7e2d92e0175f5e5b
	}

}
