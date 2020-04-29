import homework27_7.ArrayDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayDecoratorTest {

    @Test
    public void testHashNext(){
        ArrayDecorator<Integer> arrayDecorator = new ArrayDecorator<>(new Integer[]{1});
        assertTrue(arrayDecorator.hasNext());
        arrayDecorator.next();
        assertFalse(arrayDecorator.hasNext());
    }

    @Test
    public void testNext(){
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayDecorator<Integer> decorator = new ArrayDecorator<>(integers);
        for (Integer integer : integers) {
            assertTrue(decorator.hasNext());
            assertEquals(integer, decorator.next());
        }
    }

}
