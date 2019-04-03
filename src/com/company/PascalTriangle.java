package com.company;

public class PascalTriangle {

    int pascalRows;
    int[][] pascalTriangle=new int[pascalRows][pascalRows];

    public PascalTriangle(int pascalRows, int[][] pascalTriangle) {
        this.pascalRows = pascalRows;
        this.pascalTriangle = pascalTriangle;
    }

    public void pascalTriangleFill()
    {

        for(int i=0;i<pascalRows;i++)
        {
            for(int j=0;j<pascalRows;j++)
            {
                pascalTriangle[i][j]=0; // fill with zeros
                pascalTriangle[i][0]=1; //fill rows
                pascalTriangle[j][j]=1; //fill across
            }
        }
        for(int i=2;i<pascalRows;i++)
        {
            for(int j=1;j<i;j++)
            {
               pascalTriangle[i][j]=pascalTriangle[i-1][j-1]+pascalTriangle[i-1][j];
            }
        }

    }
}
