/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

import programacao_2017_adebalsalesjunior.Ex06_Funcionario.Funcionario;

/**
 *
 * @author Júnior Sales
 */
public class Ex04_Empresa {
    
public class Empresa       {
	private String nome;
	private String cnpj;
	Funcionario[] funcionarios;
	public Empresa(String nome, String cnpj, Funcionario[] funcionarios)
	{
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
	}
	//nao entendi nada desse metodo
	public void adicionaFuncionariosNaEmpresa(Funcionario funcionarios)
	{
		int i;
		Funcionario[] f = new Funcionario[10];
		this.funcionarios[f.length] = funcionarios;
		for(i = 0; i <= f.length; i++);
		{
			System.out.println(f[i]);
		}
	}
	public String imprimiEmpresaComFuncionarios()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Empresa      : " + this.nome + "\n");
		sb.append("CNPJ         : " + this.cnpj + "\n");
		sb.append("Funcionarios : " + this.funcionarios  + "\n");
		return sb.toString();
	}
}
}
