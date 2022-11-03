class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0)
            return res;
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;
        while(topRow <= bottomRow && leftCol <= rightCol){
            for(int i=leftCol; i<=rightCol; i++){
                res.add(matrix[topRow][i]);   
            }
            topRow++;
            for(int i=topRow; i<=bottomRow; i++){
                res.add(matrix[i][rightCol]);
            }
            rightCol--;
            if(topRow <= bottomRow){
                for(int i=rightCol; i>=leftCol; i--){
                    res.add(matrix[bottomRow][i]);
                }
            }
            bottomRow--;
            if(leftCol <= rightCol){
                for(int i=bottomRow; i>=topRow; i--){
                    res.add(matrix[i][leftCol]);
                }
            }
            leftCol++;
         }
         return res;
    }
}

