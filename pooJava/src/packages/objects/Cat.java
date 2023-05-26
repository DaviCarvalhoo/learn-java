package packages.objects;

public class Cat extends Animals {
    public Cat(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
        // TODO Auto-generated constructor stub
    }

    static int numeroDeGatos;

    @Override
    public String toString() {
        return "Cat [nome=" + nome + "]";
    }
    @Override
    public void soar() {
        System.out.println("Miau");
    }

}
