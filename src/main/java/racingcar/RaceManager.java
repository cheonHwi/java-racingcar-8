package racingcar;

import java.util.List;

public class RaceManager {
    public void startRace(int moveTryCnt, List<Car> carList) {
        for(int i = 0; i < moveTryCnt; i++) {
            for(Car car : carList) {
                car.move();
                car.printDistance();
            }
            System.out.println();
        }
    }
}
