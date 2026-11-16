
class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('b', 1);
        map.put('a', 1);
        map.put('l', 2);
        map.put('o', 2);
        map.put('n', 1);

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int count = Integer.MAX_VALUE;

        for (char ch : map.keySet()) {

            int available = freq.getOrDefault(ch, 0);
            int required = map.get(ch);

            count = Math.min(count, available / required);
        }

        return count;
    }
}
