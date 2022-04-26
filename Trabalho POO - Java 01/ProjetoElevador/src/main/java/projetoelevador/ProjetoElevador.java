package projetoelevador;
public class ProjetoElevador {
    
    public static void main(String[] args) {
        Elevador predio = new Elevador(0, 2, 2, 0);
        predio.Inicializar();
        predio.Entrar();
        predio.Entrar();
        predio.Sair();
        predio.Sair();
        predio.Entrar();
        predio.Subir();
        predio.Entrar();
        predio.Subir();
        predio.Descer();
        predio.Descer();
        predio.imprimir();
    }
}
