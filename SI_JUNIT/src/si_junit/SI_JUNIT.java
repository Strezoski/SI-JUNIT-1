package si_junit;
import java.util.NoSuchElementException;
/**
 *
 * @author strezoski
 */
public class SI_JUNIT {


    public int[] BubbleSort(int[] num) throws NoSuchElementException {
        int j;
        boolean flag = true;
        int temp;

        if (null == num) {
            throw new NoSuchElementException();
        }

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return num;
    }

    public boolean eParenTricifren(int number) {
        boolean result = false;
        if (number % 2 == 0 && number > 99 && number < 1000) {
            result = true;
        }
        return result;
    }
        
}
