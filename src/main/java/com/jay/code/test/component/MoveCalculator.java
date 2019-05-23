package com.jay.code.test.component;

import com.jay.code.test.domain.CarInfo;

/**
 * 移动计算
 * @Author Jay
 **/
public interface MoveCalculator {

    /**
     * 移动计算方法
     * @param carInfo
     * @return 移动或者转向
     */
    String calculate(CarInfo carInfo);
}
