
/* Exer 1
Funcionario:
departamento
nome
RG
salario...
------------
pode ser demitido
pode receber aumeto salarial
 */

public class Funcionario {

    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String RG;

   public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

/*    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  void setSalario(double salario) {
        this.salario = salario;
    }

    void recebeAumento(double aumento){
        salario += aumento;
    }

    double calculaGanhoAnual(){
        double ganhoAnual;
        ganhoAnual = salario * 12.00;
        return ganhoAnual;

    }*/

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public String getDepartamento() {
        return departamento;
    }
    //exer3
    public void mostra(){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Nome: " + this.nome + "\n" + "Departamento: " + this.departamento + "\n" + "Salario: " +
                this.salario + "\n" + "Data da Entrada: " +  this.dataEntrada + "\n" + "RG: " + this.RG);
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public Funcionario( String nome, String departamento, double salario, String dataEntrada, String RG){
        //setNome("");
        this.nome = nome;
        this.departamento = departamento;
        this. salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
    }

}
