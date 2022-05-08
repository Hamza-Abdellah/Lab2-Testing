import org.junit.Test;

public class MinMaxArrayTest {

    int[] array = new int[] {1, 2, 3, 58, 47, 229, 40};

    @Test
    public void shouldBeMaxValue() {
        int maxValue = Min_Max.getMaxValue(array);
        assert(maxValue == 229);
    }

    @Test
    public void shouldBeMinValue() {
        int minValue = Min_Max.getMinValue(array);
        assert(minValue == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = Min_Max.getMaxValue(emptyArray);
        int minValue = Min_Max.getMinValue(emptyArray);
    }
}