package animal;

/*
 * @author Charllys Brauwol
 */
public class AnimalPoli {
    private String cor;
    private double tamanho;

    public AnimalPoli(String cor, double tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void locomover(){
        System.out.println("O animal locomovel!");
    }
    
    public void exibir(){
        System.out.println("Cor: " + this.getCor()
                            +"\nTamanho" + this.getTamanho());
    }
    
    }
    
  
