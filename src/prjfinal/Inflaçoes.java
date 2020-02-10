
package prjfinal;

import java.util.ArrayList;

/**
 *
 * @author Macelo
 */
public class Inflaçoes extends Propietario {
    protected String Adventencia;
    protected String Multa;
    protected String Data;
    protected String Hora;
    protected int Valor;
    ArrayList<Propietario> ListaProp;
    ArrayList<Inflaçoes> ListaInfla;

    public Inflaçoes(String adventencia, String multa, String data, String hora, int Valor, ArrayList<Propietario> ListaProp, ArrayList<Inflaçoes> ListaInfla) {
        this.Adventencia = adventencia;
        this.Multa = multa;
        this.Data = data;
        this.Hora = hora;
        this.Valor = Valor;
       ListaProp= new ArrayList();
       ListaInfla= new ArrayList();
    }

    public Inflaçoes(String Nome, String Cpf, int Apt, int Bloco) {
        super(Nome, Cpf, Apt, Bloco);
    }


    public Inflaçoes() {
       ListaProp= new ArrayList();
       ListaInfla= new ArrayList();
    }

    public Inflaçoes(String Adventencia, String Multa, String Data, String Hora, int Valor) {
        this.Adventencia = Adventencia;
        this.Multa = Multa;
        this.Data = Data;
        this.Hora = Hora;
        this.Valor = Valor;
    }
    
    public String getAdventencia() {
        return Adventencia;
    }

    public void setAdventencia(String Adventencia) {
        this.Adventencia = Adventencia;
    }

    public String getMulta() {
        return Multa;
    }

    public void setMulta(String Multa) {
        this.Multa = Multa;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }


    public ArrayList<Propietario> getListaProp() {
        return ListaProp;
    }

    public void setListaProp(ArrayList<Propietario> ListaProp) {
        this.ListaProp = ListaProp;
    }
    public void AddProp(Propietario p){
      ListaProp.add(p);
    }

    public ArrayList<Inflaçoes> getListaInfla() {
        return ListaInfla;
    }

    public void setListaInfla(ArrayList<Inflaçoes> ListaInfla) {
        this.ListaInfla = ListaInfla;
    }
      public void AddInflaçao(Inflaçoes i){
      ListaProp.add(i);
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
}
