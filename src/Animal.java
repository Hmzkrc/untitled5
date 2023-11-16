public abstract class Animal {
    protected String name;
    protected int age;
    protected Double weight;

    public Animal() {


    }



    public Animal(String name, int age, Double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;



    }

    public abstract void eat();
    public abstract void getVoice();




}
