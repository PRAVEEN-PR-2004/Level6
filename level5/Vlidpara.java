package level5;
import java.util.*;

public class Vlidpara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        for (int j = 0; j < n; j++) {
            String str = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean isValid = true;

            for (char c : str.toCharArray()) {
                if (c == '{' || c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (st.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = st.pop();
                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (!st.isEmpty()) {
                isValid = false;
            }

            System.out.println(isValid);
            sc.close();
        }
    }
}
