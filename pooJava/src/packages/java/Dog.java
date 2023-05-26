package packages.java;

public class Dog extends Animals {
    public Dog(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
        // TODO Auto-generated constructor stub
    }

    static int numeroDeCachorros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String bolinha() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "correr":
                this.estadoDeEspirito = "Cansado";
                break;
            case "brigar":
                this.estadoDeEspirito = "Bravo";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Dog [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Dog.numeroDeCachorros = numeroDeCachorros;
    }

}
