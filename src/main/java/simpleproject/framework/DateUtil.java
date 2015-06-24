package simpleproject.framework;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */
public class DateUtil {

    private static final SimpleDateFormat FORMATTER_INPUT_FULLDATE = new SimpleDateFormat("ddMMyyyyHHmm");

    private static final SimpleDateFormat FORMATTER_OUTPUT_FULLDATE = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private static final SimpleDateFormat FORMATTER_OUTPUT_DATE_NO_HOUR = new SimpleDateFormat("dd/MM/yyyy");
   
    public static String formatOutputFullDate(Date date) {
        return FORMATTER_OUTPUT_FULLDATE.format(date);
    }

    public static String formatInputFullDate(Date date) {
        return FORMATTER_INPUT_FULLDATE.format(date);
    }
    
    public static String formataData(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(data);
        return dataFormatada;
    }
    public static String formatOutputFullDateNoHour(Date date) {
        return FORMATTER_OUTPUT_DATE_NO_HOUR.format(date);
    }
    
    public static void main(String[] args) {
	String g =	formatOutputFullDateNoHour(new Date());
		System.out.println(g);
	}
}
