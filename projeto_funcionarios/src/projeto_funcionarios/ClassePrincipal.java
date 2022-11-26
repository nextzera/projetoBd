package projeto_funcionarios;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseFuncionarios pessoa = new ClasseFuncionarios();
		pessoa.setAtributoIdFuncionario(1);
		pessoa.setAtributoNomeFuncionario("Leandro");
		pessoa.setAtributoRendaFuncionario(1.3);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(pessoa);

	}

}
