import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Character, List<String>> myMap = new HashMap<>();
        initMap(myMap);
        fillMap(myMap);
        printMap(myMap);
        printWords(myMap, 'a');
    }
    public static void addWord(Map<Character, List<String>> targetMap, String s) {
        Character c = Character.toLowerCase(s.charAt(0));
        targetMap.get(c).add(s);
        Collections.sort(targetMap.get(c));
    }
    public static void printMap(Map<Character, List<String>> targetMap) {
        targetMap.forEach((key,value)-> System.out.println("Key="+key+"\tValue:"+value));
    }
    public static void printWords(Map<Character, List<String>> targetMap, Character c) {
        List<String> targetWords = targetMap.get(Character.toLowerCase(c));
        System.out.print("Words starting with " + c + " : ");
        for (String w : targetWords) {
            System.out.print(w + "   ");
        }
        System.out.println();

    }
    public static void initMap(Map<Character, List<String>> targetMap) {
        for (char i = 'a'; i <= 'z' ; i++) {
            targetMap.put(i, new ArrayList<>());
        }
    }
    public static void fillMap(Map<Character, List<String>> targetMap) {
        String str = "Another option you have is choosing the number of syllables" +
                " in the words you speak You probably have never considered" +
                " this option before but you have it every time you open your mouth and speak" +
                " You make so many choices like this that you never even think about" +
                " but you have the choice with each one" +
                " What are you going to do with this knowledge";
        String[] words = str.split(" ");
        for (String s : words) {
            addWord(targetMap, s);
        }
    }
}