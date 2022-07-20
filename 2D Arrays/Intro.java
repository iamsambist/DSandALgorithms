public class Intro{
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6,7},{8}};
        /*
         *  static time declaration and initialization of 2 D array
         *  int [][] arr=new int[3][4];
         * Runtime initialization of array
         */
            // Accesssing all element of array
            for(int i=0;i<arr.length;i++){
                System.out.print("[");
                for(int j=0;j<arr[i].length;j++){
                        System.out.print(" "+arr[i][j]);
                }
                    System.out.print(" "+"]");
                    System.out.println();
            }  
    }
}