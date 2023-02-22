import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку из слов, разделенных пробелами:   ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        int cnt = 0;
        final char cA = 'A';
        final char cZ = 'Z';
        final char ca = 'a';
        final char cz = 'z';
        for (String word: words) {
            String w = word.trim();
            if (w.isEmpty()) {
                continue;
            }

            boolean isLatin = true;
            for (int i = 0; i < w.length(); ++i) {
                char c = w.charAt(i);
                if ((c < cA || cZ < c) && (c < ca || cz < c)) {
                    isLatin = false;
                    break;
                }
            }

            if (!isLatin) {
                continue;
            }

            ++cnt;
            System.out.println(w);
        }
        System.out.println("Количество слов состоящих только из латиницы:   " + cnt);
    }
}