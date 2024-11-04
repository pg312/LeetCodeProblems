public class LengthOflastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return   s.substring(s.lastIndexOf(" ")).length();
    }
}
