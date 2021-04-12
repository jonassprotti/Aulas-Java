
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Suporte {
    public static String getDiaDaSemana(String yyyyMMdd) throws ParseException{
        String sDiasDaSemana[] = {"", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ontem = sdf.parse(yyyyMMdd); 
        
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(ontem);
        
        int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
        return sDiasDaSemana[diaDaSemana];
    }
}

