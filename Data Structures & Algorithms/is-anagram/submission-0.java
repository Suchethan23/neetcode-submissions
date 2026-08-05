class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Hashtable<Character,Integer> st=new Hashtable<>();
        Hashtable<Character,Integer> tt=new Hashtable<>();

       for (int i = 0; i < s.length(); i++) {
            st.put(s.charAt(i), st.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            tt.put(t.charAt(i), tt.getOrDefault(t.charAt(i), 0) + 1);
        }

        return st.equals(tt);        

    }
}
