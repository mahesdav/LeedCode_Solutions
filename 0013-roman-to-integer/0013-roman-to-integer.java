class Solution {
    public int romanToInt(String s) {

        // to solve this problem, we'll iterate String from right to left
        // we will store IV:4,IX:9
        // XL: 40,XC: 90
        // CD: 500,CM: 1000

        Map<String,Integer> map = new HashMap();

        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int len = s.length()-1;
        int i=len;
        int count = 0;
        while(i>=0){
            if(i>0){
            if((s.charAt(i)=='V' || s.charAt(i)=='X') && s.charAt(i-1)=='I'){
                int val =0;
                if(s.charAt(i)=='X')
                  val = map.get("IX");
                else 
                  val = map.get("IV");
                
                count += val;
                i=i-2;
            }else if((s.charAt(i)=='L' || s.charAt(i)=='C') && s.charAt(i-1)=='X'){
                int val =0;
                if(s.charAt(i)=='L')
                  val = map.get("XL");
                else 
                  val = map.get("XC");
                
                count += val;
                i=i-2;
            }else if((s.charAt(i)=='D' || s.charAt(i)=='M') && s.charAt(i-1)=='C'){
                int val =0;
                if(s.charAt(i)=='D')
                  val = map.get("CD");
                else 
                  val = map.get("CM");
                
                count += val;
                i=i-2;
            }
            else{
             int val = map.get(String.valueOf(s.charAt(i)));
             count += val;
             i--;
            }
          }else{
              int val = map.get(String.valueOf(s.charAt(i)));
             count += val;
             i--;
          }
        }

        return count;
        
    }
    
}