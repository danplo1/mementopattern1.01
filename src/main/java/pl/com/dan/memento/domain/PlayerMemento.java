package pl.com.dan.memento.domain;

import java.util.List;

public class PlayerMemento {


    private final int healthpoint;
    private final Weapon activeWeapon;
    private final List<Weapon> weapons;


    public PlayerMemento(int healthpoint, Weapon activeWeapon, List<Weapon> weapons) {
        this.healthpoint = healthpoint;
        this.activeWeapon = activeWeapon;
        this.weapons = weapons;
    }

    int getHealthpoint() {
        return healthpoint;
    }

    Weapon getActiveWeapon() {
        return activeWeapon;
    }

    List<Weapon> getWeapons() {
        return weapons;
    }
}
