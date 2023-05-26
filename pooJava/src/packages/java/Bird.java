package packages.java;

public class Bird extends Animals {
    public Bird(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
        // TODO Auto-generated constructor stub
    }

    static int numeroDePassaros;

    @Override
    public String toString() {
        return "Bird [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }

}
