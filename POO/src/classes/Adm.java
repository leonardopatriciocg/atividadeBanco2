package classes;

	public class Adm extends Empregado {

		public Adm(String p_nome, String p_endereco, String p_telefone, double e_salario) {
			super(p_nome, p_endereco, p_telefone, e_salario);
			// TODO Auto-generated constructor stub
		}

		private double ajudaCusto;

		public Adm(String p_nome, String p_endereco, String p_telefone, double e_salario, double a_ajudaCusto) {
			super(p_nome, p_endereco, p_telefone, e_salario);
			ajudaCusto = a_ajudaCusto;
		}

		public double getAjudaCusto() {
			return ajudaCusto;
		}

		public void setAjudaCusto(double ajudaCusto) {
			this.ajudaCusto = ajudaCusto;
		}

		//método de cálculo do salario do administrador
		public double calcularSalarioAdm() {
			return getAjudaCusto() + getSalario();
		}

		private double getSalario() {
			// TODO Auto-generated method stub
			return 0;
		}

		public double getSalario() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String toString() {
			return "Salario do administrador: " + calcularSalarioAdm();
		}

	}


