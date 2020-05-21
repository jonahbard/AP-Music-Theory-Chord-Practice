import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Key newKey = new Key();
        newKey.interaction();
    }
}



class Key {
    String key;
    String numeral;
    ArrayList<String> keyArrayList = new ArrayList<String>();
    String[] keyArray = new String[]{"A", "B", "C", "D", "E", "F", "G", "A", "B", "C", "D", "E", "F"};
    String[] numerals = new String[]{"I", "II", "IV", "V", "V7", "VI", "VII"};
    
    public Key(){
        key = keyArray[(int)(Math.random()*7)];
        numeral = numerals[(int)(Math.random()*7)];
        for (String key: keyArray) {
            keyArrayList.add(key);
        }
    }
    public void interaction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name the chord: " + numeral + " of " + key);
        String input = scan.nextLine();
        if (input.equals(correctChord(numeral))){
            System.out.print("Correct!");
        } else {
            System.out.print("You suck! You're gonna fail this AP. ");
            System.out.print("The correct answer was " + correctChord(numeral));
        }
    }
    public String correctChord(String num){
        if (num.equals("I")){
            return key + keyArrayList.get(keyArrayList.indexOf(key) + 2) + keyArrayList.get(keyArrayList.indexOf(key) + 4);
        } else if (num.equals("II")) {
            return keyArrayList.get(keyArrayList.indexOf(key) + 1) + keyArrayList.get(keyArrayList.indexOf(key) + 3) + keyArrayList.get(keyArrayList.indexOf(key) + 5);
        } else if (num.equals("IV")) {
            return keyArrayList.get(keyArrayList.indexOf(key) + 3) + keyArrayList.get(keyArrayList.indexOf(key) + 5) + keyArrayList.get(keyArrayList.indexOf(key) + 7);
        } else if (num.equals("V")) {
            return keyArrayList.get(keyArrayList.indexOf(key) + 4) + keyArrayList.get(keyArrayList.indexOf(key) + 6) + keyArrayList.get(keyArrayList.indexOf(key) + 1);
        } else if (num.equals("V7")) {
            return keyArrayList.get(keyArrayList.indexOf(key) + 4) + keyArrayList.get(keyArrayList.indexOf(key) + 6) + keyArrayList.get(keyArrayList.indexOf(key) + 1)+ keyArrayList.get(keyArrayList.indexOf(key) + 3);
        } else if (num.equals("VI")) {
            return keyArrayList.get(keyArrayList.indexOf(key) + 5) + key + keyArrayList.get(keyArrayList.indexOf(key) + 2);
        } else {
            return keyArrayList.get(keyArrayList.indexOf(key) + 6) + keyArrayList.get(keyArrayList.indexOf(key) + 1) + keyArrayList.get(keyArrayList.indexOf(key) + 3);
        }
    }
}
