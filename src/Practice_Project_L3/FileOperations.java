package Practice_Project_L3;

import java.io.*;

public class FileOperations 
{
    public static void main(String[] args) 
    {
        String filename = "demo.txt";
        BufferedWriter writer = null;

        try
        {
        	writer = new BufferedWriter(new FileWriter(filename));
            writer.write("This is line 1.\n");
            writer.write("This is line 2.\n");
            writer.write("This is line 3.\n");
            System.out.println("Data has been written to the file successfully.");
        } 
        catch(IOException e) 
        {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
        finally 
        {
            try 
            {
                if(writer != null)
                    writer.close();
            } 
            catch(IOException e) 
            {
                System.err.println("Error closing the writer: " + e.getMessage());
            }
        }

        try 
        {
        	BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nContents of the file:");
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
        
        BufferedWriter w = null;

        try 
        {
        	w = new BufferedWriter(new FileWriter(filename, true));
            w.write("This is line 4 (appended).\n");
            System.out.println("\nData has been appended to the file successfully.");
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred while appending to the file: " + e.getMessage());
        }
        finally 
        {
            try 
            {
                if(w != null)
                    w.close();
            } 
            catch(IOException e) 
            {
                System.err.println("Error closing the writer: " + e.getMessage());
            }
        }
    }
}

