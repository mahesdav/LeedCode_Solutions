class Solution {
    public int countCharacters(String[] words, String chars) {

        int result_count = 0;
        int[] charCount = new int[26];

        for(char c : chars.toCharArray()){
            charCount[c-'a']++;
        }

        for(String str : words){
            int[] charCountForWord = Arrays.copyOf(charCount,charCount.length);
            int lengthOfMatchedChar = 0;
            for(char c: str.toCharArray()){
                if(charCountForWord[c-'a']>0){
                    charCountForWord[c-'a']--;
                    lengthOfMatchedChar++;
                }else
                  break;
            }

            if(lengthOfMatchedChar == str.length())
               result_count += lengthOfMatchedChar;
        }
        
        return result_count;
    }
}