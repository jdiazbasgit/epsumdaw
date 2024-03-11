package epsum.daw.basedatos.entidades;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estados-civiles")
public class EstadoCivil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descripcion;
	
=======
public class EstadoCivil {

>>>>>>> 5877d70e69482a064805aadd042c013408afcca4
}
