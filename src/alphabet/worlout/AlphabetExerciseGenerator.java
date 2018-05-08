package alphabet.worlout;

import java.util.Scanner;

public class AlphabetExerciseGenerator {

    private static String A = "A - jumping jacks x50";
    private static String B = "B - crunches x20";
    private static String C = "C - squats x30";
    private static String D = "D - push-ups x15";
    private static String E = "E - wall sit x60 sec";
    private static String F = "F - burpees x10";
    private static String G = "G - jumping jacks x20";
    private static String H = "H - squats x20";
    private static String I = "I - jumping jacks x30";
    private static String J = "J - crunches x15";
    private static String K = "K - push-ups x10";
    private static String L = "L - wall sit x2 mins";
    private static String M = "M - burpees x20";
    private static String N = "N - jumping jacks x40";
    private static String O = "O - burpees x25";
    private static String P = "P - jumping jacks x15";
    private static String Q = "Q - crunches x30";
    private static String R = "R - push-ups x15";
    private static String S = "S - burpees x30";
    private static String T = "T - squats x20";
    private static String U = "U - jumping jacks x30";
    private static String V = "V - wall sit x3 mins";
    private static String W = "W - burpees x20";
    private static String X = "X - jumping jacks x60";
    private static String Y = "Y - crunches x30";
    private static String Z = "Z - push-ups x20";

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE WORKOUT GENERATOR");
        String workout;
        String[] workoutList;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word, name or sentence to generate your workout: ");
        workout = input.nextLine();

        workoutList = splitString(workout);

        printWorkout(workoutList);

    }

    public static String[] splitString(String string){

        char[] chars = string.toCharArray();

        String[] strings = new String[chars.length];

        for(int i = 0; i < chars.length; i++){
            strings[i] = String.valueOf(chars[i]).toUpperCase();
        }

        return strings;
    }

    public static String[] split2(String string){
        return string.split("(?!^)");
    }

    public static void printWorkout(String[] workout){
        System.out.println("## YOUR WORKOUT ##");
        for(String s : workout){
            if(s.equals(" ")){
                System.out.println(" ");
            }else if(s.equals("A")){
                System.out.println(A);
            }else if(s.equals("B")){
                System.out.println(B);
            }else if(s.equals("C")){
                System.out.println(C);
            }else if(s.equals("D")){
                System.out.println(D);
            }else if(s.equals("E")){
                System.out.println(E);
            }else if(s.equals("F")){
                System.out.println(F);
            }else if(s.equals("G")){
                System.out.println(G);
            }else if(s.equals("H")){
                System.out.println(H);
            }else if(s.equals("I")){
                System.out.println(I);
            }else if(s.equals("J")){
                System.out.println(J);
            }else if(s.equals("K")){
                System.out.println(K);
            }else if(s.equals("L")){
                System.out.println(L);
            }else if(s.equals("M")){
                System.out.println(M);
            }else if(s.equals("N")){
                System.out.println(N);
            }else if(s.equals("O")){
                System.out.println(O);
            }else if(s.equals("P")){
                System.out.println(P);
            }else if(s.equals("Q")){
                System.out.println(Q);
            }else if(s.equals("R")){
                System.out.println(R);
            }else if(s.equals("S")){
                System.out.println(S);
            }else if(s.equals("T")){
                System.out.println(T);
            }else if(s.equals("U")){
                System.out.println(U);
            }else if(s.equals("V")){
                System.out.println(V);
            }else if(s.equals("W")){
                System.out.println(W);
            }else if(s.equals("X")){
                System.out.println(X);
            }else if(s.equals("Y")){
                System.out.println(Y);
            }else if(s.equals("Z")){
                System.out.println(Z);
            }else{
                System.out.println("*character not recognized");
            }

        }//FOR LOOP
    }//PRINT WORKOUT METHOD
}//CLASS


