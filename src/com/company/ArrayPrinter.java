package com.company;

public abstract class ArrayPrinter {
    static void Print(int[][] pascalTriangle)
    {
        for(int i=0;i<pascalTriangle.length;i++)
        {
            for(int j=0;j<pascalTriangle.length;j++)
            {
               if(pascalTriangle[i][j]!=0)
               System.out.print(pascalTriangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
