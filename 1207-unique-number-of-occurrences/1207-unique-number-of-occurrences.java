class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet <Integer> uniq =new HashSet<>() ;
        HashMap <Integer,Integer> freq =new HashMap<>() ;
        boolean flag =true ;
        for(int i :arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int j :freq.values()){
            if (!(uniq.add(j))){
                flag=false ;
            }
        }
        return flag ;
    }
}