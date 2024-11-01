class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String word = "";
        for(int x = 0; x < words.length; x++)
        {
            word += words[x];
            if(s.equals(word) == true)
            {
                return true;
            }
        }
        return false;
    }
}
