package Assisted_Practice_L3;

import java.io.*;

public class FileOperations 
{
	public static void main(String[] args) 
	{
        String filePath = "test.txt";
        createFile(filePath);
        writeFile(filePath, "Java Programming");
        String content = readFile(filePath);
        System.out.println("Content read from file: " + content);
        updateFile(filePath, "Updated content!");
        content = readFile(filePath);
        System.out.println("Updated content read from file: " + content);
        deleteFile(filePath);
    }

    public static void createFile(String filePath) 
    {
        try 
        {
            File file = new File(filePath);
            if (file.createNewFile()) 
            {
                System.out.println("File created: " + file.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath, String content) 
    {
        try 
        {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String readFile(String filePath) 
    {
        StringBuilder content = new StringBuilder();
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                content.append(line);
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void updateFile(String filePath, String newContent) 
    {
        try 
        {
            FileWriter writer = new FileWriter(filePath);
            writer.write(newContent);
            writer.close();
            System.out.println("Successfully updated the file.");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filePath) 
    {
        File file = new File(filePath);
        if (file.delete()) 
        {
            System.out.println("File deleted successfully.");
        } 
        else 
        {
            System.out.println("Failed to delete the file.");
        }
    }
}
