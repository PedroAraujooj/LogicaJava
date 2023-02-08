boolean solution(String inputString) {
    char[] arr = inputString.toCharArray();
    for(int i = 0 ; i<(arr.length)/2; i++){
        if(arr[i] != arr[arr.length-1-i]){
            return false;
        }
    }
    return true;
    //return inputString.equals(new StringBuilder(inputString).reverse().toString());
}
