boolean solution(int[] sequence) {
    int count = 0;
    
    for(int i = 0; i < sequence.length; i++){
        for(int j = 0; j < i; j++){
            if(sequence[i] <= sequence[j]) {
                count++; 
                sequence[j]= sequence[i];
                break;
            }       
        }
    }
    if(count>1) return false;
    return true;
}
