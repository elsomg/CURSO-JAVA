package demos.ejercicios;
import java.util.*;
public class InvertirPalabras{


public static void main(String[] args) {
  Deque<String> stack = new ArrayDeque<>();
  String contents = "hola";
  char[] letters = contents.toCharArray();
  for (int i = 0; i < letters.length; i++) {
    stack.push(String.valueOf(letters[i]));
  }
  while (!stack.isEmpty()) {
    System.out.println(stack.pop());
  }
}
}
