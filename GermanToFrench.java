public class GermanToFrench extends Translator{

    public GermanToFrench(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String text) {

        return "Перевод немецкого на фраецузский " + text;
    }
}

