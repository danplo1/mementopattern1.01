package pl.com.dan.memento.domain;

import java.util.List;

public class Player {

    private int healthpoint;

    private Weapon activeWeapon;
    List<Weapon> weapons;

    public Player() {

        healthpoint =100;
        Weapon glock = new Weapon("Glock",  200, 17);
        Weapon shotGun = new Weapon("Shotgun",  100, 2);

    }
}
