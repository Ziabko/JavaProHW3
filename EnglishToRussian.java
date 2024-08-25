public class EnglishToRussian extends Translator{

    public EnglishToRussian(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String text) {
               return "Перевод с английского на русский: " + text;
    }
}



