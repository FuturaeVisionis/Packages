package tree;

import flower.Angelica;
import plant.Gingo;
import shrub.Andomeda;


/**
 * Created by ronald on 11/09/16.
 */
public class Oak extends Gingo{

    public void branches(){
        System.out.println("Oak trees have thick branches.");
    }

    public static void main(String[] args) {
        shrub.Andomeda andomeda = new Andomeda();
        andomeda.stem();
        andomeda.birdsnest();

        Gingo gingo = new Gingo();
        gingo.soil();

        plant.Gingo innerclass = new Gingo();
        Gingo.Water my = innerclass.new Water();
        my.life();
        my.bees();

        Angelica innerclass1 = new Angelica();
        Angelica.Sun mine = innerclass1.new Sun();
        mine.grow();

        plant.Gingo innerclass2 = new Gingo();
        Gingo.Love love = innerclass2.new Love();
        love.talk();
        love.Seeds("leaves.");

        Oak oak = new Oak();
        oak.branches();
    }
}
