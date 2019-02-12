package pl.com.dan.memento;

import pl.com.dan.memento.domain.Player;
import pl.com.dan.memento.domain.PlayerMemento;

import java.util.ArrayList;
import java.util.List;

public class GameCaretaker {


    List<PlayerMemento> saveGames = new ArrayList<>();


    public void saveGame(Player player) {

        PlayerMemento memento = player.createMemento();
        saveGames.add(memento);

    }

    public Player loadGame() {
        PlayerMemento memento = saveGames.get(saveGames.size() - 1);
        return Player.createPlayer(memento);
    }

}
