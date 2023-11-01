class Solution {
    public String intToRoman(int num) {

        // to solve this problem, we'll use division logic
        // also we'll use map for key: String, value:Integer
        // array  for I,IV,V,IX,X,XL,L,XC..till M:1000

        String[] romanString = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] intVal = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb = new StringBuilder();
        int len = intVal.length-1;
        for(int i=len;i>=0;i--){
            if(num >= intVal[i]){
                int val = num / intVal[i];
                for(int j=1;j<= val;j++){
                    sb.append(romanString[i]);
                }
                num = num % intVal[i];
            }
        }
    return sb.toString();
        
    }
}