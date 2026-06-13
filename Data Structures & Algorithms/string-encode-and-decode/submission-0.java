class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String st: strs){
            sb.append("#");
            sb.append(st.length());
            sb.append("/");
            sb.append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int idx = 0;
        List<String> result = new ArrayList<>();
        while (idx < str.length()){
            int hashIndex = str.indexOf("#", idx);
            int slashIndex = str.indexOf("/", idx);
            int stringLength = Integer.valueOf(str.substring(hashIndex+1, slashIndex));
            result.add(str.substring(slashIndex+1, slashIndex+stringLength+1));
            idx = slashIndex+stringLength+1;
        }
        return result;
    }
}
