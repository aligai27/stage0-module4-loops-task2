package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while(count <= printToInclusive) {
            int count_in = 1;
            int factorial = 1;
            while(count_in <= count && count != 0) {
                factorial = factorial * count_in;
                count_in++;
            }
            System.out.println(factorial);
            count++;
        }

    }
}
