package tutorial4.zad2;

public class Matrix {
    private int[][] table;

    private static int[][] prepareTable;
    private static int nextEmptyRow;

    private Matrix(int[][] table){
        this.table = table;
    }

    public void print(){
        for(int i=0;i<table.length;i++){
            System.out.print("| ");
            for(int j=0;j<table[i].length;j++)
                System.out.print(table[i][j] + " ");
            System.out.println("|");
        }
    }

    public Matrix add(Matrix matrix){
        table = addTwoTables(table, matrix.table);
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2){
        return new Matrix(addTwoTables(m1.table, m2.table));
    }

    public Matrix subtract(Matrix matrix){
        table = subtractTwoTables(table, matrix.table);
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2){
        return new Matrix(subtractTwoTables(m1.table, m2.table));
    }

    private static int[][] addTwoTables(int[][] tab1, int[][] tab2){
        int[][] tmp = new int[tab1.length][tab1.length];
        for(int i=0;i<tab1.length;i++)
            for(int j=0;j<tab1.length;j++)
                tmp[i][j] = tab1[i][j] + tab2[i][j];
        return tmp;
    }

    private static int[][] subtractTwoTables(int[][] tab1, int[][] tab2){
        int[][] tmp = new int[tab1.length][tab1.length];
        for(int i=0;i<tab1.length;i++)
            for(int j=0;j<tab1.length;j++)
                tmp[i][j] = tab1[i][j] - tab2[i][j];
        return tmp;
    }

    public static void setUpMatrix(int rowCount, int columnCount){
        prepareTable = new int[rowCount][columnCount];
        nextEmptyRow = 0;
    }

    public static void insertRow(int[] row){
        if(nextEmptyRow < prepareTable.length){
            prepareTable[nextEmptyRow] = row;
            nextEmptyRow++;
        }
    }

    public static Matrix create(){
        Matrix matrix = new Matrix(prepareTable);
        prepareTable = null;
        nextEmptyRow = 0;
        return matrix;
    }
}
