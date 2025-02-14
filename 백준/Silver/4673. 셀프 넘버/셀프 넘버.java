import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numHashSet = new HashSet<>();
        int num = 1;
        int curSum = 0;
        for (int i = 1; i <= 10000; i++) {
            numHashSet.add(i);
        }

        for(int j = 1; j<= 10000; j++) {
            num = j;
            curSum = 0;
            while(num != 0) {
                curSum += num % 10;
                num /= 10;
            }
            curSum += j;
            numHashSet.remove(curSum);
        }

        Iterator<Integer> it = numHashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}