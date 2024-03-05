package epsum.daw.basedatos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hijos")
public class Hijo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int chicos;
	
	private int chicas;
}
