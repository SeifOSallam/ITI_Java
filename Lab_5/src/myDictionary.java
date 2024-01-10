import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myDictionary {
    SortedMap<Character, SortedSet<String>> myMap;
    myDictionary() {
        myMap = new TreeMap<>();
    }
    public boolean addWord(String s) {
        if (!s.matches("[a-zA-Z]+")) {
            System.out.println("Error, Word ("+s+") contains digits or special characters");
            return false;
        }

        Character c = Character.toLowerCase(s.charAt(0));
        if (myMap.containsKey(c)) {
            myMap.get(c).add(s.toLowerCase());
        }
        else {
            SortedSet<String> newSet = new TreeSet<>();
            newSet.add(s.toLowerCase());
            myMap.put(c, newSet);
        }
        return true;
    }
    public  void addWords(String[] s) {
        for (String str : s) {
            addWord(str);
        }
    }
    public  void addWords(List<String> s) {
        for (String str : s) {
            addWord(str);
        }
    }

    public  void removeWord(String s) {
        Character c = Character.toLowerCase(s.charAt(0));
        if (myMap.get(c).remove(s.toLowerCase())) {
            System.out.println("Element ("+s+") Removed");
        }
        else {
            System.out.println("No such element found (" + s + ")");
        }
    }

    public  void removeAllKey(Character c) {
        myMap.get(c).clear();
    }

    public  SortedSet<String> search(Pattern pattern) {
        SortedSet<String> res = new TreeSet<>();
        myMap.forEach((key, value) -> {
            for (String s : value) {
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    res.add(s);
                }
            }
        });
        return res;
    }

    public  void initMap() {
        for (char i = 'a'; i <= 'z' ; i++) {
            myMap.put(i, new TreeSet<>());
        }
    }
    public  void fillMap() {
        String str = "Another option you have is choosing the number of syllables" +
                " in the words you speak You probably have never considered" +
                " this option before but you have it every time you open your mouth and speak" +
                " You make so many choices like this that you never even think about" +
                " but you have the choice with each one" +
                " What are you going to do with this knowledge";
        String[] words = str.split(" ");
        for (String s : words) {
            addWord(s);
        }
    }

    public  void printMap() {
        myMap.forEach((key,value)-> System.out.println("Key="+key+"\tValue:"+value));
    }
    public  void printWords(Character c) {
        Set<String> targetWords = myMap.get(Character.toLowerCase(c));
        System.out.print("Words starting with " + c + " : ");
        for (String w : targetWords) {
            System.out.print(w + "   ");
        }
        System.out.println();
    }
}
