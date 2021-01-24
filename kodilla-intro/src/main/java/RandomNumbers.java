import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    private List<Integer> givenNumbers = new ArrayList();
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();

        System.out.println(randomNumbers.getMaxNumber());
        System.out.println(randomNumbers.getMinNumber());
    }
    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            givenNumbers.add(temp);
            sum = sum + temp;
            result++;
        }
        return result;
    }
    public int getMaxNumber() {
        int max = givenNumbers.get(0);
        for (int i = 0 ; i < givenNumbers.size(); i++) {
            if (givenNumbers.get(i) > max) {
                max = givenNumbers.get(i);
            }
        }
        return max;
    }
    public int getMinNumber() {
        int min = givenNumbers.get(0);
        for (int i = 0; i < givenNumbers.size(); i++) {
            if (givenNumbers.get(i) < min) {
                min = givenNumbers.get(i);
            }
        }
        return min;
    }
}
