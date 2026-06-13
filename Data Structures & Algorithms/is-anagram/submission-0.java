class Solution {
    public boolean isAnagram(String s, String t) {
        // We can use a int Array to keep track of letters that are in s and t
        // Questions I would ask the interviewer: 
            // does s and t contain only lowercase letters
            // 
        int[] charPosArr = new int[26];
        for (char c: s.toCharArray()){
            charPosArr[c-'a'] += 1;
        }
        for (char c: t.toCharArray()){
            charPosArr[c-'a'] -= 1;
        }
        for (int i=0; i<charPosArr.length; i++){
            if (charPosArr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
