int solution(int[][] matrix) {
    int sum = 0;
    boolean cond = false;
    
    for(int i = 0; i < matrix[0].length; i++) sum+=matrix[0][i];
    
    for(int i = 1; i < matrix.length; i++){
        for(int j = 0; j< matrix[i].length; j++){
            cond = true;
            for(int k = 0; k < i; k++){
                if(matrix[k][j] == 0){
                    cond = false;
                }
            }
            if(cond == true){
                sum += matrix[i][j];
            }
        }
    }
    return sum;

}
