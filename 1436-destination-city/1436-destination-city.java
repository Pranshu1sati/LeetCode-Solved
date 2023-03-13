class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String>m1 = new HashMap<>();
        HashMap<String,String>m2 = new HashMap<>();
         for(List<String> route : paths) {
            m1.put(route.get(0), route.get(1));
        }
        for(List<String> route:paths){
            if(!m1.containsKey(route.get(1)))
                return route.get(1);
        }
        return "";
    }
}