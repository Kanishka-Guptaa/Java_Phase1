package Assisted_Practice;


public class StringConversion 
{
    public static void main(String[] args)
    {
        String s = "Java Programming";
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuilder stringBuilder = new StringBuilder(s);

        System.out.println("Original String: " + s);
        System.out.println("StringBuffer: " + stringBuffer.toString());
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}

