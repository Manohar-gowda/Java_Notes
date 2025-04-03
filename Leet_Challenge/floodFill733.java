public class floodFill733 {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        int oldCol = image[sr][sc]; //get old color from starting pixel
        if(oldCol == color) { //no need to perform flood because oldcol is same as newCol
            printMat(image);
            return;
        }

        DFS(image,sr,sc,color,oldCol);
        printMat(image);
    }

    public static void printMat(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void DFS(int[][] image, int sr, int sc, int newCol, int oldCol) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldCol) {
            return;
        }

        image[sr][sc] = newCol;

        DFS(image,sr+1,sc,newCol,oldCol);
        DFS(image,sr-1,sc,newCol,oldCol);
        DFS(image,sr,sc+1,newCol,oldCol);
        DFS(image,sr,sc-1,newCol,oldCol);
    }
}
