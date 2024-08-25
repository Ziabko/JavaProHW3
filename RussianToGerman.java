public class RussianToGerman extends Translator{

    public RussianToGerman(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String text) {
              return "Перевод с русского на немецкий: " + text;
    }
}

