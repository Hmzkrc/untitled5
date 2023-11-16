public  class Main   {
    public static void main(String[]args){
        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Karabas", 3, 10.5);
        animals[1] = new Pigeon("Taklaci", 2, 0.8, "Gray", "Rock Pigeon");
        animals[2] = new Blowfish("sarii", 1, 0.2);
        animals[3] = new Mammal("Safiye", 5, 15.0);


        for (Animal animal : animals) {
            System.out.println("Details:" + animal.toString());
            animal.eat();
            animal.getVoice();
            System.out.println();

        }
    }



}
