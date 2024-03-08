package epsum.daw.basedatos.entidades;
import javax.persistence.Column;



@Entity
@Table(name="Cargos");
public class Cargo {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String description;

	
}
