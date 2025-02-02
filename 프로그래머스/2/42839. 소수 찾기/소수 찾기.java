import java.util.*;

class Solution {
    public int solution(String numbers) {
        String[] eachNumbers = numbers.split("");

        Set<Integer> uniqueCases = getNumberOfCases(eachNumbers);

        int primeCount = 0;
        for (int num : uniqueCases) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }
    
    private Set<Integer> getNumberOfCases(String[] eachNumbers) {
        Set<Integer> numberOfCases = new HashSet<>();
        boolean[] visited = new boolean[eachNumbers.length];

        generateNumbers(eachNumbers, "", visited, numberOfCases);
        
        return numberOfCases;
    }

    private void generateNumbers(String[] eachNumbers, String current, boolean[] visited, Set<Integer> numberOfCases) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (num > 1) {
                numberOfCases.add(num);
            }
        }

        for (int i = 0; i < eachNumbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                generateNumbers(eachNumbers, current + eachNumbers[i], visited, numberOfCases);
                visited[i] = false; 
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false; 
        if (num == 2) return true; 
        if (num % 2 == 0) return false; 

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }  
}
