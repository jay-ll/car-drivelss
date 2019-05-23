package com.jay.code.test.component;

import com.jay.code.test.constatnt.Direction;
import com.jay.code.test.constatnt.Retangular;
import com.jay.code.test.domain.CarInfo;
import com.jay.code.test.service.Car;
import org.springframework.stereotype.Component;

/**
 * @Author Jay
 **/
@Component
public class MoveToNorth implements MoveCalculator{


    /**
     *
     * @param carInfo
     * @return
     */
    @Override
    public String calculate(CarInfo carInfo) {
        int x = carInfo.getPositionX();
        int y = carInfo.getPositionY();
        if(carInfo.getDiretion().equals(Direction.NORTH)){
            for (int i = 1; i < Retangular.HEIGHT; i++){
                carInfo.setPositionX(x);
                carInfo.setPositionY(y+i);
                carInfo.setDiretion(Direction.NORTH);
            }
        }
        return "north";
    }
}
