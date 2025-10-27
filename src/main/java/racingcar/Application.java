package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StringValidator validator = new StringValidator();
        RaceManager raceManager = new RaceManager();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = validator.validateIsEmpty(
                InputConsole.readLine()
        );

        System.out.println("시도할 횟수는 몇 회인가요?");
        int moveTryCount = validator.validateMoveTryCount(
                InputConsole.readLine()
        );

        String[] tokenizedCarList = input.split(",");
        List<Car> carList = new ArrayList<>();

        for(String token : tokenizedCarList) {
            carList.add(
                    new Car(validator.validateCarName(token))
            );
        }

        raceManager.startRace(moveTryCount, carList);


        List<Car> winnerList = raceManager.announceWinner(carList);

        StringBuilder winnerString = new StringBuilder();
        for(int winnerCnt = 0; winnerCnt < winnerList.size(); winnerCnt++) {
            Car winner = winnerList.get(winnerCnt);

            winnerString.append(winner.getName());
            if(winnerCnt != winnerList.size()-1) {
                winnerString.append(",");
            }
        }

        System.out.println("최종 우승자 : " + winnerString);

    }
}
