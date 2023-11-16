public abstract class Pigeon extends Bird {
    protected String species;

    public Pigeon() {}

    public Pigeon(String name, int age, Double weight, String featherColor, String species){

        super(name, age, weight, featherColor);
        this.species = species;


    }

}
