package temp.objects;

import temp.SnakeMain;

import java.time.Year;

public class Apple {
    public int posX;
    public int posY;

    public Apple(int x, int y){
        this.posX = x;
        this.posY = y;
    }

    public void setRandomPosition(){
        posX = (int) (Math.random() * SnakeMain.WIDTH - 1);
        posY = (int) (Math.random() * SnakeMain.HEIGHT - 1);

    }
}
