class RandomizedSet {

    // we'll take help of ArrayList and HashMap to solve this problem.
    // HashMap : to store the index of each element (element,indexOfElement)
    // ArrayList : to insert and getRandom in O(1) time

    List<Integer> listVal;
    Map<Integer,Integer> map;
    Random rand;

    public RandomizedSet() {

        listVal = new ArrayList();
        map = new HashMap();
        rand = new Random();
        
    }
    
    public boolean insert(int val) {
        
        if(map.containsKey(val)){
            return false;
        }

        map.put(val,listVal.size());
        listVal.add(val);

        return true;
    }
    
    public boolean remove(int val) {

        if(!map.containsKey(val)){
            return false;
        }

        int index = map.get(val);
        int lastElement = listVal.get(listVal.size()-1);

        listVal.set(index,lastElement);
        map.put(lastElement,index);
        listVal.remove(listVal.size()-1);
        map.remove(val);

        return true;
        
    }
    
    public int getRandom() {

if (!listVal.isEmpty()) {
    return listVal.get(rand.nextInt(listVal.size()));
} else {
    // Handle the case when the list is empty, e.g., return a default value or throw an exception.
    // For example, you could return null or throw a custom exception.
    return 0;
}        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */