package pl.com.dan.memento;

import pl.com.dan.memento.domain.Player;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        GameCaretaker caretaker = new GameCaretaker();

        boolean running = true;
        Player player = new Player();

        Scanner scanner = new Scanner(System.in);

        while (running) {
            String command = scanner.nextLine();
            switch (command) {
                case "quit":
                    running = false;
                    break;
                case "shoot":
                    player.shoot();
                    break;
                case "reload":
                    player.reload();
                    break;
                case "glock":
                    player.changeToGlock();
                    break;
                case "shotgun":
                    player.changeToShotgun();
                    break;
                case "save":
                    caretaker.saveGame(player);

            }
            scanner.close();
        }
    }
}