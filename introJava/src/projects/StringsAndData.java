package projects;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsAndData {
    public static void main(String[] args) {
        String nome = "Davi";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >=5 && agora.getHour()<=12){
            saudacao = "Bom dia";
        }else if (agora.getHour() > 12 && agora.getHour()<=18){
            saudacao = "Boa tarde";
        }else if (agora.getHour() > 18 && agora.getHour()<=24){
            saudacao = "Boa noite";
        }else{
            saudacao = "Boa Madrugada";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s%n", nome,diaSemana,saudacao.toUpperCase());

    }
}
