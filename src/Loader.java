import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        Integer v=0;
        Integer p=0;
        Integer m=0;
        String text = "Вася заработал 100 рублей, Петя - 100 рубля, а Маша - 100 рублей";
        String zpVasya;
        String zpPetya;
        String zpMasha;
        String [] sum;
        Integer summa = 0;

        //==================================================== Первый спопсоб
        int v1, v2 , v3 , v4 , v5 , v6;
        v1 = text.indexOf("Вася заработал");
        v2 = text.indexOf("рублей");
        zpVasya = text.substring(v1+14, v2).trim();
        v = v.parseInt(zpVasya);
        v3 = text.indexOf("Петя - ");
        v4 = text.indexOf("рубля");
        zpPetya = text.substring(v3 + 6 ,v4).trim();
        p = p.parseInt(zpPetya);
        v5 = text.lastIndexOf("рублей");
        v6 = text.indexOf("а Маша");
        zpMasha = text.substring(v6+ 8  ,v5).trim();
        m = m.parseInt(zpMasha);
        System.out.println(v + p + m);

        System.out.println();

        //==================================================== Второй способ
        text = text.replaceAll("[\\D]" , " ").trim();
        sum = text.split("\\s+");
        for (int i = 0; i < sum.length ; i++) {
            summa += summa.parseInt(sum[i]);
        }
        System.out.println("Сумма ребят составляет:" + summa);
    }
}