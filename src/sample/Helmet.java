package sample;

import java.util.ArrayList;

public class Helmet {

    private ArrayList<Weapon> weapons_list;

    public Helmet(){
        Sword s = new Sword(20);
        Axe a = new Axe(15);
        weapons_list = new ArrayList<Weapon>();
        weapons_list.add(s);
        weapons_list.add(a);
    }
}
