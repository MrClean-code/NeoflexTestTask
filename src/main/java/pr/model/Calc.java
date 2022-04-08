package pr.model;

import javax.validation.constraints.*;

public class Calc {
    @Max(100000)
    @NotNull(message = "number is valid, min = 1, max = 100000")
    @Min(1)
    private double firstNumber;

    @Max(100000)
    @NotNull(message = "number is valid, min = 1, max = 100000")
    @Min(1)
    private double secondNumber;

    @NotNull(message = "operation is valid: +, -, *, /.")
    private char operation;

    public Calc() {
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}
