package epsum.daw.basedatos.entidades;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresas")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 45)
	private String nombre;
	
	@Column(length = 9)
	private String cif;
	
=======
public class Empresa {

>>>>>>> refs/remotes/origin/basedatos
}
