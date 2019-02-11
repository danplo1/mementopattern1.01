package pl.com.dan.memento.domain;

public class Weapon {


    private String name;
    private int bulletsLeft;
    private int maxBullets;
    private int bulletsInClip;


    public Weapon(String name,  int maxBullets, int bulletsInClip) {
        this.name = name;
        this.maxBullets = maxBullets;
        this.bulletsInClip = bulletsInClip;
    }
}
