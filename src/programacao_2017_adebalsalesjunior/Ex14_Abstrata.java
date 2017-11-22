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
public class Ex14_Abstrata {

    abstract class Aluno {

        protected String nome;
        protected String endereco;
        protected String instituicao;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getInstituicao() {
            return instituicao;
        }

        public void setInstituicao(String instituicao) {
            this.instituicao = instituicao;
        }
    }
}

abstract class AlunoPos {

    protected String nome;
    protected String endereco;
    protected int anoIngresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}

abstract class Pessoa {

    protected String nome;
    protected String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

public class pessoaApp {
    public static void main(String[] args) {
        Pessoa vitu = new Pessoa() {
        };

        Endereco endereco = new Endereco();
        endereco.setEndereco("Rua 148");
    }

    private static class Endereco {

        public Endereco() {
        }

        private void setEndereco(String rua_148) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}