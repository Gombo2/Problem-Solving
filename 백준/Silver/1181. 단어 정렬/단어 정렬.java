import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> wordSet = new HashSet<>();
        int wordCount = Integer.parseInt(br.readLine());
        for(int i = 0; i < wordCount; i++) {
            String word = br.readLine();
            wordSet.add(word);
        }

        wordSet.stream()
                .sorted((w1, w2) -> {
                    if (w1.length() != w2.length()) {
                        return Integer.compare(w1.length(), w2.length());  // 길이 기준 정렬
                    } else {
                        return w1.compareTo(w2);  // 길이가 같으면 사전순 정렬
                    }
                })
                .forEach(System.out::println);  // 정렬된 단어 출력

    }
}
