class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(pattern.length() != s.split(" ").length) return false;
        int i=0;
        for(String str: s.split(" ")) {
            if(map.containsKey(str)){
                char ch = map.get(str);
                if(ch != pattern.charAt(i)) return false;
            }else {
                if(set.contains(pattern.charAt(i))) return false;
                map.put(str,pattern.charAt(i));
                set.add(pattern.charAt(i));
            }
            i++;
        }
        return true;
    }
}