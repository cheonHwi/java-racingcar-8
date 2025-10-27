package racingcar;

public class StringValidator {
    public String validateIsEmpty(String input) {
        if(input.isBlank()) throw  new IllegalArgumentException("Input must not be blank");
        return input;
    }

    public int validateRepeatCnt(String repeatCnt) {
        try{
            return Integer.parseInt(repeatCnt);
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("Repeat Count must be a number");
        }
    }
}
