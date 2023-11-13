package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while((multiplyByAndToInclusive > 0 && count <= multiplyByAndToInclusive) || (multiplyByAndToInclusive < 0 && count >= multiplyByAndToInclusive) ) {
            System.out.println(count*multiplyByAndToInclusive);
            count  = multiplyByAndToInclusive < 0? count-1:count+1;
        }
    }
}
