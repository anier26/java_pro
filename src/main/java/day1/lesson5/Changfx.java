package day1.lesson5;

public class Changfx {
    private int length;
    private int width;


    public Changfx(){}

    public Changfx(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    public int getZhou(){
        return (length+width)*2;
    }

    public int getMJ(){
        return length*width;
    }

}
