package animal;

/*
 * @author Charllys Brauwol
 * Polimorfismo de Sobrescrita
 */
public class Animal {

    public static void main(String[] args) {
        
        Cachorro laranja = new Cachorro("Caramelo", "Amarelo", 1.2);
        System.out.println("==============Cachorro=============");
        laranja.exibir();
        laranja.locomover();
        
        Cobra nara = new Cobra(true, "Branca", 1.5);
        System.out.println("==============Cobra=============");
        nara.exibir();
        nara.locomover();
        
        Peixe zeze = new Peixe(5, "Dourado", 0.30);
        zeze.locomover();
        
        Ave rui = new Ave(0.27, "Preto", 0.7);
        rui.locomover();

    }

}
