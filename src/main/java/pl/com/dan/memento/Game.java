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
                    player.printStatus();
                    break;
                case "glock":
                    player.changeToGlock();
                    player.printStatus();
                    break;
                case "shotgun":
                    player.changeToShotgun();
                    player.printStatus();
                    break;
                case "save":
                    caretaker.saveGame(player);
                    System.out.println(" Gra została zapisana!");
                    break;
                case "load":
                    player = caretaker.loadGame();
                    System.out.println(" Gra została załadowana!");
                    player.printStatus();
                    break;

            }

        }
        scanner.close();
    }
}