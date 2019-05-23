package com.jay.code.test.domain;

/**
 * 车辆信息
 * @Author Jay
 **/
public class CarInfo {

    /**
     * x坐标
     */
    public int positionX;
    /**
     * y坐标
     */
    public int positionY;
    /**
     * 移动方向
     */
    public String diretion;

    public CarInfo() {

    }

    public CarInfo(int postitionX, int postitonY, String diretion) {
        this.positionX = postitionX;
        this.positionY =postitonY;
        this.diretion = diretion;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getDiretion() {
        return diretion;
    }

    public void setDiretion(String diretion) {
        this.diretion = diretion;
    }

}
