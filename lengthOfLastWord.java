class Solution {

    // Everything was written by myself, except for the s = s.trim(); which I got from my friend since I was getting on spaces after the final word.
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
