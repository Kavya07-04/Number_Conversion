import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyClass {
    public static int toDecimal(String input, int base){
        int[] ch = new int[input.length()];
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 11);
        map.put("c", 12);
        map.put("d", 13);
        map.put("e", 14);
        map.put("f", 15);
        map.put("g", 16);
        map.put("h", 17);
        map.put("i", 18);
        map.put("j", 19);
        map.put("k", 20);
        map.put("l", 21);
        map.put("m", 22);
        map.put("n", 23);
        map.put("o", 24);
        map.put("p", 25);
        map.put("q", 26);
        map.put("r", 27);
        map.put("s", 28);
        map.put("t", 29);
        map.put("u", 30);
        map.put("v", 31);
        map.put("w", 32);
        map.put("x", 33);
        map.put("y", 34);
        map.put("z", 35);
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.toUpperCase().charAt(i) >= 65 && (int) input.toUpperCase().charAt(i) <= 90) {
                ch[i] = map.get(String.valueOf(input.charAt(i)).toLowerCase());
            } else {
                ch[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        int sum = 0;
        int i = input.length() - 1;
        for (int c : ch) {
            int a = (int) (Math.pow(base, i));
            sum = sum + a * c;
            i--;
        }
        return sum;
    }
    public static String toBinary(String input, int base){
        int number = Integer.parseInt(input);
        String ans = "";
        while (number>0){
            int d = number%base;
            number = number/base;
            ans += String.valueOf(d);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t|== Conversion Of Numbers ==|");
        System.out.println("1. Any Base To Decimal ");
        System.out.println("2. Any Base To Decimal ");
        System.out.print("Enter Base (Ex. Binary : 2, Octal : 8) : ");
        int base = scanner.nextInt();
        System.out.print("Enter Any Number: ");
        scanner.nextLine();
        String input = scanner.nextLine();
        int td = toDecimal(input,base);
        String tb = toBinary(input,base);
        System.out.println(input + " in Decimal is " + td);
        System.out.println(input + " in Binary is " + tb);
    }
}
