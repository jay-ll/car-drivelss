package com.jay.code.test.service.impl;

import com.jay.code.test.component.MoveCalculator;
import com.jay.code.test.component.MoveCalculatorFactory;
import com.jay.code.test.constatnt.Command;
import com.jay.code.test.constatnt.Direction;
import com.jay.code.test.domain.CarInfo;
import com.jay.code.test.service.Car;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 汽车接口
 * @Author Jay
 **/
public class CarImpl implements Car {

    @Autowired
    private MoveCalculatorFactory moveCalculatorFactory;

    CarInfo carInfo = getInstance();

    /**
     * 汽车移动方法
     * @param command 移动命令
     * @throws Exception
     */
    public void move(String command) throws Exception {
        if (command.equals(Command.MOVE)){
            MoveCalculator moveCalculator = moveCalculatorFactory.get(carInfo.getDiretion());
            String direction = moveCalculator.calculate(carInfo);
            System.out.println("x: " + getPositionX() + " y: " + getPositionY() + " direction: " + direction);
            if (command.equals(Command.TURN)){
                throw new Exception("汽车方向错误");
            }
        }
    }

    /**
     * 获取X位置
     * @return x
     */
    public int getPositionX() {
        return carInfo.getPositionX();
    }

    /**
     * 获取Y位置
     * @return y
     */
    public int getPositionY() {
        return carInfo.getPositionY();
    }

    public String getOrientation() {
        return carInfo.getDiretion();
    }

    /**
     * 获取方向
     * @return direction
     */
    private CarInfo getInstance(){
        CarInfo carInfo = new CarInfo(1,1,"north");
        return carInfo;
    }
}
