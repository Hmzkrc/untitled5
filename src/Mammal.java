public  class Mammal extends Animal {
    public Mammal(){






    }

    public Mammal(String name, int age, Double weight){

        super(name, age, weight);


    }


    public void eat() {
        System.out.println("Mammal is eating");

    }

    public void getVoice() {

        System.out.println("Mammal is making a sound");

    }
}


