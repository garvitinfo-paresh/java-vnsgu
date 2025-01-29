class first
{
    public static void main(String arg[])
    {
        // System.out.print("1 Hello world...");
        // System.out.println("2 Hello world...");
        // System.out.print("3 Hello world...");
        // int a=100,b=200;
        // int c=30;
        // if(a>b && a>c)
        // {
        //     System.out.println("a is greater "); 
        // }
        // else if(b>c)
        // {
        //     System.out.println("b is greater "); 
        // }
        // else
        // {
        //     System.out.println("c is greater "); 
        // }
        // System.out.println(i); 
        // System.out.println(++i); 
        // System.out.println(i); 
        // int i=21;
        // for(;;)
        // {
        //     if(i<=30)
        //         System.out.println(i++); 
        //     else    
        //         break;
        // }
        // int i= 1;
        // do{
        //     System.out.println(i); 
        //     i++;
        // }while(i<=10);
        int i,j,ch=65,sp=10;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=sp;j++)
                    System.out.print(" ");
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            sp++;
            System.out.println();
        }
    }
}