package temaStackQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

            Stack<Character> stack = new Stack<Character>();

            Queue<Character> queue = new LinkedList<Character>();

            for (int i = 0; i < inputString.length(); i++) {
                stack.push(inputString.charAt(i));
            }

            for (int i = 0; i < inputString.length(); i++) {
                queue.add(inputString.charAt(i));
            }

            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                if (queue.remove().equals(stack.pop())) {
                    continue;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            if (!isPalindrome) {
                System.out.println("Not a Palindrome");
            } else {
                System.out.println("Palindrome");
            }

        }
    }


