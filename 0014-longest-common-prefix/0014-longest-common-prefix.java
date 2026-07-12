class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();

        int len = Math.min(first.length(), last.length());

        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != last.charAt(i))
                break;
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}