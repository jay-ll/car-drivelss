package com.jay.code.test.component;

import com.jay.code.test.constatnt.Direction;
import com.jay.code.test.domain.CarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Jay
 **/
@Component
public class MoveCalculatorFactory {

    @Autowired
    private MoveToNorth moveToNorth;

    @Autowired
    private MoveToSouth moveToSouth;

    @Autowired
    private MoveToEast moveToEast;

    @Autowired
    private MoveToWest moveToWest;

    public MoveCalculator get(String moveDiretion){
        if (moveDiretion.equals(Direction.EAST)){
            return moveToEast;
        }else if (moveDiretion.equals(Direction.WEST)){
            return moveToWest;
        }else if (moveDiretion.equals(Direction.SOUTH)){
            return moveToSouth;
        }else if (moveDiretion.equals(Direction.NORTH)){
            return moveToNorth;
        }

        return null;

    }
}
