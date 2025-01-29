class arith
{
    arith(int a,int b,int c,int d)
    {
        System.out.println(" a + b + c + d : "+(a+b+c+d));
        // return a+b;
    }
    arith(int a,int b)
    {
        System.out.println(" a + b : "+(a+b));
        // return a+b;
    }
    arith(int a,int b,int c)
    {
        System.out.println(" a + b +c : "+(a+b
        +c));
        // return a+b+c;
    }
}
class cons
{
    public static void main(String s[])
    {
        arith opr1 = new arith(10,20);
        arith opr2 = new arith(10,20,30);
        arith opr3 = new arith(10,20,30,40);
        // opr1.doSum(10,20,30,40);
        // System.out.println(" a + b : "+opr1.doSum(10,20));
        // System.out.println(" a + b + c : "+opr1.doSum(10,20,30));
    }
}