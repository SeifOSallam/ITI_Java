public class SlidingWindow {

    public static int greatestSub(String s) {
        int start = 0;
        int end = 0;
        int maxsub = 0;
        for (int i=0;i<s.length();i++) {
            String curr = String.valueOf(s.charAt(i));
            while (s.substring(start, end).contains(curr)) {
                start++;
            }
            end++;
            if (maxsub < end-start)
                maxsub = end-start;

        }
        return maxsub;
    }
    public static void main(String[] args) {
        System.out.println(greatestSub("abcdddaabcccccdefgh"));
    }
}
