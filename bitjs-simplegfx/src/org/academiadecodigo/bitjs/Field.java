package org.academiadecodigo.bitjs;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    private static final int PADDING = 10;
    private static final int MIN_COL = PADDING;
    private static final int MIN_ROW = PADDING;
    private Picture field;

    public Field() {
        this.field = new Picture(PADDING,PADDING, "resources/field.png");
    }

    public void init(){
        field.draw();
    }

    public static int getMinCol() {
        return MIN_COL;
    }

    public static int getMinRow(){
        return MIN_ROW;
    }

    public int getMaxCol(){
        return field.getWidth();
    }

    public int getMaxRow(){
        return field.getHeight();
    }

}
