package pl.com.dan.memento.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {


    private static Random random = new Random(System.currentTimeMillis());

    private int healthpoint;

    private Weapon activeWeapon;

    List<Weapon> weapons = new ArrayList<Weapon>();

    Weapon glock = new Weapon("Glock", 200, 17);
    Weapon shotGun = new Weapon("Shotgun", 100, 2);

    public Player() {

        this.healthpoint = 100;
        this.weapons.add(glock);
        this.weapons.add(shotGun);
        this.activeWeapon = glock;

    }

    public Player(int healthpoint, Weapon activeWeapon, List<Weapon> weapons) {
        this.healthpoint = healthpoint;
        this.activeWeapon = activeWeapon;
        this.weapons = weapons;
    }


    public void shoot() {
        this.activeWeapon.shoot();
        this.healthpoint = this.healthpoint - (random.nextInt(5));
        this.printStatus();
    }

    public void printStatus() {

        System.out.println("Poziom życia: " + this.healthpoint + " Jesteś uzbrojony w: " + this.activeWeapon.getName());
    }

    public void reload() {
        this.activeWeapon.reload();
    }

    public void changeToGlock() {

        this.activeWeapon = glock;
    }

    public void changeToShotgun() {

        this.activeWeapon = shotGun;
    }

    public PlayerMemento createMemento() {

        return new PlayerMemento(healthpoint, activeWeapon, weapons);
    }



    public static Player createPlayer(PlayerMemento memento) {
        return new Player(memento.getHealthpoint(), memento.getActiveWeapon(), memento.getWeapons());
    }

}
