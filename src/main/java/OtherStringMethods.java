public class OtherStringMethods {

    /**
     * Substring returns part of the string from 'start' (inclusive) to 'end' (exclusive).
     */
    public String partOfString(String s, int start, int end){
        return s.substring(start, end);
    }

    /**
     * compareTo compares strings lexicographically (like dictionary order).
     * Returns > 0 if s1 > s2, < 0 if s1 < s2, and 0 if they are equal.
     */
    public int compareLexigraphically(String s1, String s2) {
        return s1.compareTo(s2);
    }

    /**
     * split splits the string into parts using the given delimiter (splitAround).
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround) {
        return s1.split(splitAround);
    }
}
