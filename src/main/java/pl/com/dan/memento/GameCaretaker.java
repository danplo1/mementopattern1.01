package pl.com.dan.memento;

import pl.com.dan.memento.domain.Player;
import pl.com.dan.memento.domain.PlayerMemento;

public class GameCaretaker {


    public void saveGame(Player player) {

        PlayerMemento memento =  player.createMemento();

    }
}
