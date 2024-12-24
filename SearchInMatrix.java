// Q. Search in a row-wise sorted matrix

// Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
// Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].


public class SearchInMatrix {

    public static boolean searchRowMatrix(int[][] mat, int x){

        int n=mat.length,m=mat[0].length;
        for(int i =0;i<n;i++){
            if(x<mat[i][0] || x>mat[i][m-1]) continue;
            int low=0,high=m-1,mid;
                while(low<=high){
                    mid=(low+high)/2;
                    int temp = mat[i][mid];
                    if(temp==x)return true;
                    else if(temp<x)low=mid+1;
                    else high=mid-1;
                }
            }
            return false;
        }
    public static void main(String[] args) {



        int Matrix[][]={{3, 4, 9},
                        {2, 5, 6},
                        {9, 25, 27}};
           int x=9;                           //To be search      
           
           System.out.println(searchRowMatrix(Matrix,x));
    }
}
