package com.RRJava.Examples;

public class Main {

    public static void main(String[] args) {
        /**/
        double[] leftValues = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightValues = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for ( int i = 0; i< opCodes.length; i++)
        {
            //MathEquation meq = new MathEquation(leftValues[i], rightValues[i], opCodes[i]);
            MathEquation meq = new MathEquation();
            meq.SetLeftValue(leftValues[i]);
            meq.SetRightValue(rightValues[i]);
            meq.SetOpCode(opCodes[i]);
            results[i] = meq.Execute();
        }

        for (double result: results) {
            System.out.println("result = " + result);
        }

        ReadFileContent file = new ReadFileContent();
        System.out.println(file.Total());

    }
}


