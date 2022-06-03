class cmd
{
    public static void main(String[] args)
    {
        try
        {
           Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"});
  
        }
        catch (Exception e)
        {
        }
    }
}