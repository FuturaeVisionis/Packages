package flower;

import flower.Angelica.*;
import plant.Gingo;

/*
Within the same packages, you don't need to import!!
 */


/**
 * Created by ronald on 12/09/16.
 */
public class Petunia {

    public static void main(String[] args) {

        Angelica angelica = new Angelica();
        angelica.root();

        flower.Angelica magic = new Angelica();
        Angelica.Sun rabbit = magic.new Sun();
        rabbit.grow();

        flower.Angelica light = new Angelica();
        Angelica.Frost dove = light.new Frost();
        dove.vegetable();
    }
}
