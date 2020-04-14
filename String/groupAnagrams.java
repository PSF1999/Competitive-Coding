class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList();
        int count = 0;
        for(String string : strs) {
            char[] characters = string.toCharArray();
            Arrays.sort(characters);
            String modString = String.valueOf(characters);
            if(map.containsKey(modString)) {
                int level = map.get(modString);
                result.get(level).add(string);
            }
            else {
                map.put(modString,count++);
                List<String> list = new ArrayList();
                list.add(string);
                result.add(list);
            }
        }
        return result;
    }
}