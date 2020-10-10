package org.academiadecodigo.bitjs;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player {

    private Picture player;
    private Position position;

    public Player() {
        this.player = new Picture(500,500, "resources/player.png");
        position = new Position(player.getWidth(), player.getHeight());
        init();
    }

    public void init(){
        player.draw();
    }

    public void moveRight(){

        player.translate(10,0);
        position.setCol(position.getCol() +10);
    }

    public void moveLeft(){
        player.translate(-10,0);
        position.setCol(position.getCol() - 10);
    }

    public void moveUp(){
        player.translate(0, - 10);
        position.setRow(position.getRow() - 10);
    }

    public void moveDown(){
        player.translate(0, + 10);
        position.setRow(position.getRow() + 10);
    }

    public Position getPosition(){
        return this.position;
    }
}
