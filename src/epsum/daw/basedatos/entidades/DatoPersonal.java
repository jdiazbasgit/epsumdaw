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

		private int salario;
		private String descripcion;
		
		@ManyToOne
		private Hijo mihijo;
		@ManyToOne
		private EstadoCivil miestadocivil;
		
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

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Hijo getMihijo() {
			return mihijo;
		}

		public void setMihijo(Hijo mihijo) {
			this.mihijo = mihijo;
		}

		public DatoPersonal(int id, int salario, String descripcion, Hijo mihijo) {
			super();
			this.id = id;
			this.salario = salario;
			this.descripcion = descripcion;
			this.mihijo = mihijo;
		}

		
		public EstadoCivil getMiestadocivil() {
			return miestadocivil;
		}

		public void setMiestadocivil(EstadoCivil miestadocivil) {
			this.miestadocivil = miestadocivil;
		}
		
}
