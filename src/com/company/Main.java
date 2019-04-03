package com.company;

public class Main {

    public static void main(String[] args) {

        int pascalRows=Integer.parseInt(args[0]);
        int[][] pascalTriangle=new int[pascalRows][pascalRows];
        PascalTriangle triangle=new PascalTriangle(pascalRows,pascalTriangle);
        triangle.pascalTriangleFill();
        ArrayPrinter.Print(pascalTriangle);

    }
}
