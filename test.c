#include<stdio.h>
int main()
{
    // double a[10];
    // printf("\n sizeof - (char) :  %ld",sizeof(char));
    // printf("\n sizeof - (int) :  %ld",sizeof(int));
    // printf("\n sizeof - (float) :  %ld",sizeof(float));
    // printf("\n sizeof - (double) :  %ld",sizeof(double));
    // printf("\n sizeof - (int a[10]) :  %ld",sizeof(a));
    
    // printf("\n address of a[0] :  %ld",&a[0]);
    // printf("\n address of a[1] :  %ld",&a[9]);

    int i, j;
    int a[3][3];
        //    printf("%ld",&a[0][0]);
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("\n%d",&a[i][j]);
        }
        printf("\n");

    }

    return 0;
}