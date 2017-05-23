package flower;
/*
Check out the inner classes!!
 */

/**
 * Created by ronald on 11/09/16.
 */
public class Angelica {

    public void stem() {
        System.out.println("All flowers have stems.");
    }

    public void fruit() {
        System.out.println("A strawberry isn't a vegetable!");
    }

    public void root() {
        System.out.println("All flowers have roots.");
    }

    public class Sun {
        public void grow() {
            System.out.println("All flowers need sun rays to grow.");
        }
    }

    public class Frost {
        public void vegetable() {
            System.out.println("Sprouts need the frost to be tasty.");
        }
    }
}

