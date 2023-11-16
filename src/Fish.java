public abstract class Fish extends Animal {
    public Fish(){


    }
    public Fish(String name, int age, Double weight){
        super(name, age, weight);

    }
    public void eat() {
        System.out.println("Fish is eating");
    }
    public void getVoid() {
        System.out.println("Fish is silent");
    }
}
