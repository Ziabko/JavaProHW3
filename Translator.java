public abstract class Translator {

    public String name;
    public int age;
    public String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract String translate(String text);

}
