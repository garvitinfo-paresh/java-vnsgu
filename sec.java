class arith
{
    void doSum(int a,int b,int c,int d)
    {
        System.out.println(" a + b + c + d : "+(a+b+c+d));
        // return a+b;
    }
    int doSum(int a,int b)
    {
        // System.out.println(" a + b : "+(a+b));
        return a+b;
    }
    int doSum(int a,int b,int c)
    {
        // System.out.println(" a + b : "+(a+b));
        return a+b+c;
    }
}
class sec
{
    public static void main(String s[])
    {
        arith opr1 = new arith();
        opr1.doSum(10,20,30,40);
        System.out.println(" a + b : "+opr1.doSum(10,20));
        System.out.println(" a + b + c : "+opr1.doSum(10,20,30));
    }
}