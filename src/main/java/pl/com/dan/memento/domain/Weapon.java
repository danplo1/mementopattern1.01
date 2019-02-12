package pl.com.dan.memento.domain;

public class Weapon {


    private String name;
    private int bulletsLeft;
    private int maxBullets;
    private int bulletsInClip;


    public Weapon(String name, int maxBullets, int bulletsInClip) {
        this.name = name;
        this.bulletsLeft = maxBullets;
        this.maxBullets = maxBullets;
        this.bulletsInClip = bulletsInClip;
    }

    public void shoot() {

        if (this.bulletsLeft > 0) {
            System.out.println("Strzelasz z " + this.name + "-a. Pozostało w magazynku: " + this.bulletsLeft);
            this.bulletsLeft--;

        }else{
            System.out.println("Koniec amunicji, musisz przeładować!");
        }
    }

    public void reload() {

        this.bulletsLeft = this.bulletsInClip;
    }

    public String getName(){
        return name;
    }
}