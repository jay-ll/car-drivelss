package com.jay.code.test.component;

import com.jay.code.test.constatnt.Direction;
import com.jay.code.test.constatnt.Retangular;
import com.jay.code.test.domain.CarInfo;
import org.springframework.stereotype.Component;

/**
 * @Author Jay
 **/
@Component
public class MoveToWest implements MoveCalculator {

    /**
     *
     * @param carInfo
     * @return
     */
    @Override
    public String calculate(CarInfo carInfo) {
        int x = carInfo.getPositionX();
        int y = carInfo.getPositionY();
        if(carInfo.getDiretion().equals(Direction.WEST)){
            for (int i = 1; i < Retangular.WIDTH; i++){
                carInfo.setPositionX(x-i);
                carInfo.setPositionY(y);
                carInfo.setDiretion(Direction.WEST);
            }
        }
        return "west";
    }
}
