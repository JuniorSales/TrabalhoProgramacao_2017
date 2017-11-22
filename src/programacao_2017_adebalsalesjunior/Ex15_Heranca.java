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
public class Ex15_Heranca {
    abstract class Professor {

    protected int codigo;
    protected String nome;

    public Professor(int cod, String name) {
        codigo = cod;
        nome = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void setCodigo(String xxxxxx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
}

public class ProfessorApp {
    public static void main (String [] args){
    ProfessorApp asdf = new ProfessorApp();
    asdf.setNome("asdf");
    asdf.setCodigo("xxxxxx");
    
    }

    private ProfessorApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNome(String asdf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCodigo(String xxxxxx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

abstract class ProfessorEs extends Professor {
    protected String cursoEspecializacao;

    public ProfessorEs(int cod, String name) {
        super(cod, name);
    }

    public String getCursoEspecializacao() {
        return cursoEspecializacao;
    }

    public void setCursoEspecializacao(String cursoEspecializacao) {
        this.cursoEspecializacao = cursoEspecializacao;
    }
}

abstract class ProfessorMes extends Professor {
    protected String cursoMestrado;

    public ProfessorMes(int cod, String name) {
        super(cod, name);
    }

    public String getCursoMestrado() {
        return cursoMestrado;
    }

    public void setCursoMestrado(String cursoMestrado) {
        this.cursoMestrado = cursoMestrado;
    }
}