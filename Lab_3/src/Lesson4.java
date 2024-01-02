import java.util.*;
import java.util.function.*;
public class Lesson4 {
    public static Scanner scan = new Scanner(System.in);
    public static Function<Float, Double> getFahrenheitFunction() {
        return (x) -> ((x*(double)9/5)+32);
    }
    public static Function<List<Integer>, Map<String, Double>> getQuadraticFunction() {
        return (myList) -> {
            Map<String, Double> resMap = new HashMap<>();
            int a = myList.get(0);
            int b = myList.get(1);
            int c = myList.get(2);
            double sqrtVal = (b*b)-(4*a*c);
            if (sqrtVal < 0) {
                System.out.println("Square root cannot be negative");
                return resMap;
            }
            if (a == 0) {
                System.out.println("First number cannot be zero");
                return resMap;
            }
            double x1 = (b*(-1)+Math.sqrt(sqrtVal))/(2*a);
            double x2 = (b*(-1)-Math.sqrt(sqrtVal))/(2*a);
            resMap.put("firstVal", x1);
            resMap.put("secVal", x2);
            return resMap;
        };
    }
    public static double toFahrenheit(Function<Float, Double> input) {
        System.out.println("Enter the number");
        float x = scan.nextFloat();
        return getFahrenheitFunction().apply(x);
    }

    public static Map<String, Double> calcQuad(Function<List<Integer>, Map<String, Double>> myFunc) {
        List<Integer> myList = new ArrayList<>();
        for (int i=0;i<3;i++) {
            System.out.println("Enter number " + i);
            try {
                myList.add(scan.nextInt());
            }
            catch(Exception e) {
                System.out.println("Invalid input");
                return null;
            }
        }
        return myFunc.apply(myList);
    }

    public static void main(String[] args) {
        System.out.println("To fahrenheit: " + toFahrenheit(getFahrenheitFunction()));
        Map<String, Double> resMap = calcQuad(getQuadraticFunction());
        if (resMap != null && resMap.get("firstVal") != null) {
            System.out.println("First Value: " + resMap.get("firstVal"));
            System.out.println("Second Value: " + resMap.get("secVal"));
        }

    }
}
