package org.academiadecodigo.bitjs;

public class Playground {

    public static void main(String[] args) {

        Field field = new Field();
        field.init();

        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game(player1, player2);

        game.init();

    }

}
