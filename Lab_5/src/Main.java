import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        myDictionary dictionary = new myDictionary();
        //initMap(myMap);
        //fillMap(myMap);
        Scanner scan = new Scanner(System.in);

        boolean cont = true;
        do {
            System.out.println("1- Insert Word");
            System.out.println("2- Insert Words");
            System.out.println("3- Remove Word");
            System.out.println("4- Search Word");
            System.out.println("5- Clear Key");
            System.out.println("6- Print Map");
            System.out.println("7- Print Key");
            System.out.println("8- Exit");
            try {
                int inp = Integer.parseInt(scan.next());
                switch (inp) {
                    case 1: {

                        System.out.println("Enter the word");
                        scan.nextLine();
                        String word = scan.nextLine();
                        dictionary.addWord(word);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the sentence");
                        scan.nextLine();
                        String sentence = scan.nextLine();
                        dictionary.addWords(Arrays.asList(sentence.split(" ")));
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the word to be removed");
                        String word = scan.next();
                        dictionary.removeWord(word);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the word");
                        String word = scan.next();
                        SortedSet<String> matchingWords = dictionary.search(Pattern.compile(word, Pattern.CASE_INSENSITIVE));
                        if (!matchingWords.isEmpty()) {
                            System.out.println("Matching words: " + matchingWords);
                        }
                        else {
                            System.out.println("There are no matching words.");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Enter the key");
                        String input = scan.nextLine();
                        if (input.length() > 1) {
                            System.out.println("Invalid input.");
                            break;
                        }
                        Character c = Character.toLowerCase(input.charAt(0));
                        if (dictionary.myMap.containsKey(c)) {
                            dictionary.removeAllKey(c);
                            System.out.println("Key " + c + " is cleared.");
                        }
                        else {
                            System.out.println("Please enter a proper key. [a-z]");
                        }
                        break;
                    }
                    case 6: {
                        dictionary.printMap();
                        break;
                    }
                    case 7: {
                        System.out.println("Enter the key");
                        Character c = Character.toLowerCase(scan.next().charAt(0));
                        if (dictionary.myMap.containsKey(c)) {
                            if (!dictionary.myMap.get(c).isEmpty()) {
                                dictionary.printWords(c);
                            }
                            else {
                                System.out.println("Key is empty");
                            }
                        }
                        else {
                            System.out.println("Please enter a proper key. [a-z]");
                        }
                        break;
                    }
                    case 8: {
                        cont = false;
                        System.out.println("Thank you!");
                        break;
                    }
                    default: {
                        System.out.println("Please enter a number between 1-8 ya user :)");
                        break;
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Invalid input, try again");
            }
        } while (cont);
    }

}