package epsum.daw.basedatos.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	}

}
