package com.jay.code.test.service;

/**
 * 汽车接口
 * @Author Jay
 **/
public interface Car {

    /**
     * 移动方法
     * @param command
     */
    void move(String command) throws Exception;

    /**
     * 获取X左边
     * @return
     */
    int getPositionX();

    /**
     * 获取Y坐标
     * @return
     */
    int getPositionY();

    /**
     * 获取方向
     * @return
     */
    String getOrientation();
}
