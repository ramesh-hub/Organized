package com.RRJava.Examples;

import java.io.*;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.lang.module.FindException;

  public class ReadFileContent {
    private final String file = "D:\\Java_Projects\\RedHatJdk\\Organized\\src\\com\\RRJava\\Examples\\Numbers.txt";
    private int total = 0;
    private BufferedReader oReader;

    ReadFileContent()
    {

    }

     int Total() throws FindException
        {
        try
        {
            oReader = new BufferedReader( new FileReader(file));
            String line;
            while ((line = oReader.readLine()) != null)
            {
                total += Integer.parseInt(line);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.printf("File not found. %s%n", ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println("Could not read the file. " + ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            //FindException find = new FindException();
            //find.initCause(ex);//cause means the either the original exception to pass on ...
        }
        finally
        {
            try{
            if(oReader != null)
                oReader.close();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return total;
    }
}
