import packages.java.Dog;

public class Animal {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        Dog dog0 = new Dog("Dog","Branco",15,5.5);

        dog.setNome("Puppy");
        dog.setCor("cinza");
        dog.setPeso(25.4);
        dog.setAltura(45);

        dog.latir();
        System.out.println("Nome do Cachorrro: " + dog.getNome());
        System.out.println("O cachorro está: " + dog.interagir("correr"));
        System.out.println("Joguei uma bolinha é ele retornou com a " + dog.bolinha());
        dog0.latir();
        System.out.println("Nome do Cachorrro: " + dog0.getNome());
        System.out.println("O cachorro está: " + dog0.interagir("correr"));
        System.out.println("Joguei uma bolinha é ele retornou com a " + dog0.bolinha());
    }
}
