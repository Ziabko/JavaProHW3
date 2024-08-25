public class Main {
    public static void main(String[] args) {

Translator englishToRussian = new EnglishToRussian("Eva", 35, "female");
Translator russianToGerman = new RussianToGerman("Emilia", 27, "female");
Translator germanToFrench = new GermanToFrench("Kirill", 36, "male");


        System.out.println(englishToRussian.translate("Hello - Привет!"));
        System.out.println(russianToGerman.translate("Привет - Hallo!"));
        System.out.println(germanToFrench.translate("Hallo - Bonjour !"));

    }
}