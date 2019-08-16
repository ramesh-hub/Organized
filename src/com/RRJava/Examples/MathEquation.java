package com.RRJava.Examples;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double result;

    public  MathEquation()
    {

    }

    public MathEquation(double leftValue, double rightValue, char opCode)
    {
        try {
            this.leftValue = leftValue;
            this.rightValue = rightValue;
            this.opCode = opCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SetLeftValue(double leftValue)
    {
        this.leftValue = leftValue;
    }

    public void SetRightValue(double rightValue)
    {
        this.rightValue = rightValue;
    }

    public void SetOpCode(char opCode)
    {
        this.opCode = opCode;
    }

    public double Execute()
    {
        switch(opCode)
        {
            case 'd':
                result = leftValue / rightValue;
                break;
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            default:
                System.out.println("Invalid opCode");
                break;
        }
        return  result;
    }
}
