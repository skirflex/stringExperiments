public class secret {
    public secret() {
    }

    public static void main(String[] args) {
        String safe = searchAndReplaceDiamonds("Номер кредитной карты <1234 1234 1234> 8912", "***");
        System.out.println(safe);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int secrecy1 = text.indexOf(60);
        int secrecy2 = text.indexOf(62);
        text.substring(secrecy1, secrecy2);
        text = text.substring(0, secrecy1) + placeholder + text.substring(secrecy2 + 1);
        return text;
    }
}