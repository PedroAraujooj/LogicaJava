int solution(int year) {
    double sec = (double)year/100;
    if(year%100 == 0){
        return year/100;
    }
    sec = Math.floor(sec);
    sec++;
    System.out.println("solution(year) = " + sec);
    return (int)sec;
}
