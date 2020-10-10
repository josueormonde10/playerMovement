package org.academiadecodigo.bitjs;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    private Player player1;
    private Player player2;

    private Picture field;

    private KeyboardEvent right;
    private KeyboardEvent left;
    private KeyboardEvent up;
    private KeyboardEvent down;
    private KeyboardEvent right2;
    private KeyboardEvent left2;
    private KeyboardEvent up2;
    private KeyboardEvent down2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public void init(){
        bootstrapP1();
        bootstrapP2();
    }

    private void bootstrapP1(){

        Keyboard keyboard1 = new Keyboard(this);

        //mover player para a direita (-> e D)
        right = new KeyboardEvent();
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard1.addEventListener(right);



        // mover player para a esquerda (<- e A)
        left = new KeyboardEvent();
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);
        keyboard1.addEventListener(left);



        // mover player para cima (^ e W)
        up = new KeyboardEvent();
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up.setKey(KeyboardEvent.KEY_UP);
        keyboard1.addEventListener(up);



        //mover player para baixo (v e S)
        down = new KeyboardEvent();
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKey(KeyboardEvent.KEY_DOWN);
        keyboard1.addEventListener(down);


    }

    private  void bootstrapP2(){
        Keyboard keyboard2 = new Keyboard(this);

        right2 = new KeyboardEvent();
        right2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right2.setKey(KeyboardEvent.KEY_D);
        keyboard2.addEventListener(right2);

        left2 = new KeyboardEvent();
        left2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left2.setKey(KeyboardEvent.KEY_A);
        keyboard2.addEventListener(left2);

        up2 = new KeyboardEvent();
        up2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up2.setKey(KeyboardEvent.KEY_W);
        keyboard2.addEventListener(up2);

        down2 = new KeyboardEvent();
        down2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down2.setKey(KeyboardEvent.KEY_S);
        keyboard2.addEventListener(down2);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == right.getKey()){
           /* if( player1.getPosition().getCol() == field.getWidth() ){

            }*/
            player1.moveRight();
        }

        if (keyboardEvent.getKey() == left.getKey()){
            //if( player1.getPosition().getCol() == field.g)
            player1.moveLeft();
        }

        if(keyboardEvent.getKey() == up.getKey()){
            player1.moveUp();
        }

        if(keyboardEvent.getKey() == down.getKey()){
            player1.moveDown();
        }
// --------- Player2 ------------------------//
        if (keyboardEvent.getKey() == right2.getKey()){
           /* if( player2.getPosition().getCol() == field.getWidth() ) {

            }*/
            player2.moveRight();
        }

        if (keyboardEvent.getKey() == left2.getKey()){
            player2.moveLeft();
        }

        if(keyboardEvent.getKey() == up2.getKey()){
            player2.moveUp();
        }

        if(keyboardEvent.getKey() == down2.getKey()){
            player2.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

