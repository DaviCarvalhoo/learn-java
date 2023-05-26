package packages.java;

public class Dog {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Dog(){}

    public Dog(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

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

    public void latir() {
        System.out.println("Au Au");
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

}
