package epsum.daw.basedatos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "datos_personales")
	public class DatoPersonal {
		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@ManyToOne
		private Hijo hijo;
		@ManyToOne
		private EstadoCivil estadoCivil;
		
		
		public DatoPersonal(int id, Hijo hijo, EstadoCivil estadoCivil) {
			super();
			this.id = id;
			this.hijo = hijo;
			this.estadoCivil = estadoCivil;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Hijo getHijo() {
			return hijo;
		}

		public void setHijo(Hijo hijo) {
			this.hijo = hijo;
		}

		public EstadoCivil getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(EstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
}