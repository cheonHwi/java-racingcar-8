package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceManager {
    public void startRace(int moveTryCount, List<Car> carList) {
        for(int i = 0; i < moveTryCount; i++) {
            for(Car car : carList) {
                car.move();
                car.printDistance();
            }
            System.out.println();
        }
    }
    public List<Car> announceWinner(List<Car> carList) {
        List<Car> winner = new ArrayList<>();
        int winnerPosition = -1;

        for(Car car : carList) {
            int position = car.getPosition();

            if(position > winnerPosition) {
                winnerPosition = position;
                winner.clear();
                winner.add(car);
            }else if(position == winnerPosition) {
                winner.add(car);
            }
        }
        return winner;
    }
}
