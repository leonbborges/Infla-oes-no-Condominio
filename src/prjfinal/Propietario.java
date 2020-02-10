
package prjfinal;
/**
 * @author Leonardo
 */
public class Propietario {
    protected String Nome;
    protected String Cpf;
    protected int Apt;
    protected int Bloco;

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

 

    public int getApt() {
        return Apt;
    }

    public void setApt(int Apt) {
        this.Apt = Apt;
    }

    public int getBloco() {
        return Bloco;
    }

    public void setBloco(int Bloco) {
        this.Bloco = Bloco;
    }


    public Propietario() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Propietario(String Nome, String Cpf, int Apt, int Bloco) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Apt = Apt;
        this.Bloco = Bloco;
    }
}
