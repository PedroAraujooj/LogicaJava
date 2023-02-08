static int solution(int[] statues) {
    //List<Integer> lista = Arrays.asList(statues);
     ArrayList<Integer> newarr = new ArrayList<Integer>();
     for (int integer : statues) {
         newarr.add(integer);
     }
     ArrayList<Integer> result = new ArrayList<Integer>();
     
     Comparator<Integer> c = (i1, i2) -> {
         return Integer.compare(i1, i2);
     };
     newarr.sort(c);
     
     //newarr.forEach((Integer integer) -> System.out.println(integer));
     
     int first = newarr.get(0);
         
     for(int i = 0; i < newarr.get(newarr.size()-1); i++){
         if(i != newarr.get(i)){
             newarr.add(i, i);
             result.add(i);
             i--;   
         }
     }
     for(int i =0; i<result.size();i++) {
         System.out.println(result.get(i));
     }
     for(int i = 0; i < result.size(); i++) {
         if(result.get(i) < first) {
             System.out.println(result.get(i));
             result.remove(i);
             i--;
         }
     }
     System.out.println(result.size());
     return result.size();
 }