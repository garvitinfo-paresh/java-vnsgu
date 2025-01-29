class stationary
{
    
    stationary()
    {
        System.out.println(" ready to write ");
    }
    stationary(String ink)
    {
        System.out.println(ink +" inserted Now, you can write ");
    }
   
}
class pen
{
    public static void main(String s[])
    {
        stationary celloGripper = new stationary(); 
        stationary parkerBetaInk = new stationary("ink"); 
        stationary kuruToga = new stationary("lead"); 
    }
}