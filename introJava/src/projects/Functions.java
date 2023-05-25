package projects;
public class Functions {
    public static void main(String[] args) {
        int resultado = soma(2,4);
        System.out.println(resultado);
        ola();
    }
    public static int soma(int a, int b){
        return a+b;
    }
    public static  void ola(){
        System.out.println("Olá, Mundo!");
    }
}
