package flower;

/**
 * Created by ronald on 12/09/16.
 */
public class Hortensia {

    String plant;
    String poisonous;

    public Hortensia(String plant, String poisonous) {
        this.plant = plant;
        this.poisonous = poisonous;
        System.out.println("My " + plant + " is " + poisonous);
    }

    public class Strawberry extends Angelica {
        @Override
        public void fruit() {
            super.fruit();
            System.out.println("I am the new age strawberry. I am a crossing between a vegetable and a fruit!");
        }
    }

    public static void main(String[] args) {

        Hortensia hortensia = new Hortensia("Cactus", "prickly.");

        flower.Hortensia ant = new Hortensia("asparagus", "very tasty.");
        Hortensia.Strawberry wasp = ant.new Strawberry();
        wasp.fruit();

        Angelica angelica = new Angelica();
        angelica.fruit();

    }
}