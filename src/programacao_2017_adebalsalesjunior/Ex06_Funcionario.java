/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

/**
 *
 * @author Júnior Sales
 */
public class Ex06_Funcionario {

    private static class Empresa {

        public Empresa() {
        }
    }
    public class Funcionario extends Empresa {

    private String nome;
    private String cargo;
    private String superior;

    public Funcionario() {
    }

    public Funcionario(String name, String carg, String sup) {
        nome = name;
        cargo = carg;
        superior = sup;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }
}
}
