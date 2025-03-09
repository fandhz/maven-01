package com.helloworld.app;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}



public class VulnerableApp {
    public static void main(String[] args) {

        String password = "12345678"; 

        
        if (args.length > 0 && args[0].equals(password)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        String userInput = args.length > 1 ? args[1] : "";
        String command = "ping " + userInput; 

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
