public abstract class Bird extends Animal{
    protected String featherColor;

    public Bird(){

    }
    public Bird(String name, int age, Double weight, String featherColor) {

        super(name, age, weight);
        this.featherColor = featherColor;


    }
    public void eat() {

        System.out.println("Bird is pecking");
    }

    public void getVoice() {

        System.out.println(" Bird is chirping");
    }
}
