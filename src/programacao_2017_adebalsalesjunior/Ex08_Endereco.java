/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior_marciopPiter;

/**
 *
 * @author Júnior Sales
 */
public class Ex08_Endereco {
   public static void main(String args []) {	
   
   }
	private Integer cep;
	private String cidade;
	private String estado;
	private String rua;
	private Integer numero;
	
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Rua: " + this.rua + ", Número: " + this.numero +
			   ", Cidade: " + this.cidade + ", Estado: " + this.estado +
			   ", CEP: " + this.cep;
	}
	
}

