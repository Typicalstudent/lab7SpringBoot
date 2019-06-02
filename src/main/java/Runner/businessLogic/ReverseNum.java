package Runner.businessLogic;

import org.springframework.stereotype.Component;

@Component
public class ReverseNum {
    private int result;

    public ReverseNum() {
        result = 0;
    }

    public int reverseRecurs(int number) {
        Operationable operation;
        operation = (x, y) -> x + (y % 10);

        if (number != 0) {
            result *= 10;
            result = operation.calculate(result, number);
            number /= 10;
            reverseRecurs(number);
        }
        return result;
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public int getResult() {
        return result;
    }
    public void resetResult() {
        result = 0;
    }
}

