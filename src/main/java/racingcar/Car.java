package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public int move(int moveTryCount) {
        for(int i = 0; i < moveTryCount; i++) {
            if(Randoms.pickNumberInRange(0,9) >= 4) {
                position++;
            }
        }
        return position;
    }

    public int getPosition() {
        return position;
    }

    public void printDistance() {
        System.out.println(name + " : " + "-".repeat(Math.max(0, position)));
    }

    public Car(String name, int moveTryCount) {
        this.name = name;
        this.position = move(moveTryCount);
    }
}
