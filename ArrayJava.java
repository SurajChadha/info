package work;

public class ArrayJava{
    int x[][] = new int[2][];
    x[0]=new int[2];
    x[1]=new int[4];
    x[0][0]=10;
    x[0][1]=20;
    x[1][0]=100;
    x[1][1]=101;
    x[1][2]=102;
    x[1][3]=104;

    for(int i=0; i<x.length;i++)
    {
        for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j] + " ");

        System.out.println();
    }

}