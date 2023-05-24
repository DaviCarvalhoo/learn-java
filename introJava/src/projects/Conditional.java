package projects;

public class Conditional {
    public static void main(String[] args) {
        int nota = 4;

        String graduacao = "";

        if(nota > 8){
            graduacao = "A";
        }
        else if (nota<=8 && nota >= 6){
            graduacao = "B";
        }
        else if (nota<6 && nota > 4){
            graduacao = "C";
        }else{
            graduacao = "D";
        }
        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado, nota: " + graduacao);
            break; 
            case "C":
                System.out.println("Recuperação, nota: " + graduacao);
            break;
            default :
                System.out.println("Aluno reprovado, nota: "+ graduacao); 
        }
    }
}
