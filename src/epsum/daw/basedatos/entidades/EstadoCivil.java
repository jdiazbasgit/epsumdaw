package epsum.daw.basedatos.entidades;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estados_civiles")
public class EstadoCivil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 45)
	private String descripcion;
=======
public class EstadoCivil {

>>>>>>> refs/remotes/origin/basedatos
}
