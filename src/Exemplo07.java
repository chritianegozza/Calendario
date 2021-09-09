import java.util.Calendar;

public class Exemplo07 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2021

        System.out.printf("%tF\n", agora);
         //2021-07-14
        System.out.printf("%tD\n", agora);
         //07/14/21
        System.out.printf("%tr\n", agora);
         //08:58:1 PM
        System.out.printf("%tT\n", agora);
    }    //20:58:11
}
