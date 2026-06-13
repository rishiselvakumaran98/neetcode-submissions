class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Can we get empty string?
        // IS there any words with length more than 100?
        // Can we return the output in any order or does it have to be in order?

        // Look through words
        // Sort the word to get a canonical word
        // then use the canonical words to store current word into list of words
        // Return the list of words into a 2D nested list
        HashMap<String, List<String>> wordMap = new HashMap<>();
        for (String s: strs){
            char[] canWordArr = s.toCharArray();
            Arrays.sort(canWordArr);
            String canString = String.valueOf(canWordArr);
            List<String> wordList = wordMap.getOrDefault(canString, new ArrayList<>());
            wordList.add(s);
            wordMap.put(canString, wordList);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> e: wordMap.entrySet()){
            result.add(e.getValue());
        }
        return result;
    }
}
