package epsum.daw.basedatos.entidades;

<<<<<<< HEAD
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cargos")
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
>>>>>>> refs/remotes/origin/basedatos
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	
	private String descripcion;
=======
public class Cargo {
>>>>>>> refs/remotes/origin/basedatos
=======
	private String descripcion;

>>>>>>> refs/remotes/origin/basedatos

}
