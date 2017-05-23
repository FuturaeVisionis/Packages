package plant;

/**
 * Created by ronald on 11/09/16.
 */
public class Gingo {

    public void soil() {
        System.out.println("Plants need soil to grow.");
    }

    public class Water {
        public void life() {
            System.out.println("All living things need water.");
        }

        public void bees() {
            System.out.println("Flowers always have bees around them.");
        }
    }

    public class Love {
        public void talk() {
            System.out.println("Talking to plants, helps them grow.");
        }
        public String Seeds (String name){
            System.out.println("Plants have many " + name);
            return name;
        }
    }
}


