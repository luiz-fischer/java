package Vendas;

public class Funcionario extends Usuario{
    private String setor;
    private double salario;

    public Funcionario(
        String nome,
        String senha,
        String setor, 
        double salario
    ) {
        super(nome, senha);
        this.setor = setor;
        this.salario = salario;
    }


    // ======= SETS =======
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // ======= GETS =======
    public String getSetor() {
        return this.setor;
    }
    public double getSalario() {
        return this.salario;
    }

   // ======== Impressão ========
   @Override
   public String toString() {
       super.toString();
     String print = "========== FUNCIONÁRIO ==========" + "\n" +
                    "Usuario: " + getNome() + "\n" +
                    "Setor: " + getSetor() + "\n" +
                    "Salário R$:  " + getSalario() + "\n" ;
     return print;
   }
    
}
