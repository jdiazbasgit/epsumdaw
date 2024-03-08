package epsum.daw.basedatos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Estados_civiles {
	
	
	@Entity
	@Table(name = "Estados_civiles")
	public class Estado_civil {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(length = 45)
		private String descripcion;

	}

}
