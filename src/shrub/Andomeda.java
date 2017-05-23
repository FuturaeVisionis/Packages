package shrub;

import flower.Angelica;

/**
 * Created by ronald on 11/09/16.
 */
public class Andomeda extends Angelica {
    public void birdsnest() {
        System.out.println("Birds build their nests in shrubs.");
    }

    public static void main(String[] args) {
        flower.Angelica angelica = new Angelica();
        angelica.stem();
        angelica.root();

    }
}
