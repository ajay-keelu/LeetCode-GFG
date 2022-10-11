class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character>mag = new ArrayList<>();
        for(int i = 0 ;i < magazine.length() ; i++)
        {
            mag.add(magazine.charAt(i));
        }
        for(int i = 0 ;i < ransomNote.length() ; i++)
        {
            if(mag.contains(ransomNote.charAt(i)))
                mag.remove(Character.valueOf(ransomNote.charAt(i)));
            else
                return false;
            
        }
        return true;
    }
}