class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        for(int x = 0; x< s.length(); x++)
        {
            length++;
            if(s.charAt(x) == ' ')
            {
                length = 0;
            }
        }
        return length;
    }
}
