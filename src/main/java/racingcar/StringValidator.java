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

    public String validateCarName(String carName) {
        String token = carName.trim();
        if(token.isBlank())
            throw new IllegalArgumentException("Car name must not be blank");
        else if (token.length() > 5)
            throw new IllegalArgumentException("Car name length must less than 5");
        else
            return token;
    }
}
