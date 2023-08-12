public class ColumnNumber
{
    public static void main(String[] args)
    {
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String s)
    {
        int result = 0;
        int p = 0;

        for(int  i = s.length()-1; i>=0; i--)
        {
           char c = s.charAt(i);
           int value = (int)c - 65 +1;
           result+= value*Math.pow(26, p);
           p++;
        }
        return result;
    }
}
