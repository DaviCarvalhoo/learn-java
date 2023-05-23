package projects.java;

public class Bool {
    public static void main(String[] args) {
        boolean fazendoSol = true;
        boolean fimDeSemana = true;
        //Boolean Table
        
        // && (AND) true && true = true
        // || (OR) true || false = true
        //         false || false = false

        boolean vamosAPraia = fazendoSol && fimDeSemana;
        System.out.println("Vamos a praia? "+ vamosAPraia);

        // Ternario
        String condicao = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(condicao);
    }
}
