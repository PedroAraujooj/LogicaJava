int solution(int[] inputArray) {
    int maior = inputArray[0]*inputArray[1];
    for(int i = 0; i < inputArray.length -1; i+=1){
        if((inputArray[i]*inputArray[i+1])>maior){
            maior = inputArray[i]*inputArray[i+1];
        }
    }
    return maior;
}
