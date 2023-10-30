package homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ArrayUtilTest {

    @ParameterizedTest
    @MethodSource("oldArrays")
    void makeNewArray(int[] oldArray, int[] newArray) {
        Assertions.assertArrayEquals(newArray, ArrayUtil.makeNewArray(oldArray));
    }

    public static Stream<Arguments> oldArrays() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.of(new int[]{1, 1, 2, 3, 1, 3, 4}, new int[]{3, 4}));
        out.add(Arguments.of(new int[]{1, 1, 10, 1}, new int[]{}));
        out.add(Arguments.of(new int[]{1, 1, 10}, new int[]{10}));
        return out.stream();
    }

    @Test
    void makeNewArrayThrowException() {
        int[] oldArray = new int[]{3, 3, 3};

        Assertions.assertThrows(RuntimeException.class, () -> ArrayUtil.makeNewArray(oldArray));
    }

    @ParameterizedTest
    @MethodSource("arrays")
    void isArrayContainsFrom1and2(int[] array, boolean result) {
        Assertions.assertEquals(result, ArrayUtil.isArrayContainsFrom1and2(array));
    }

    public static Stream<Arguments> arrays() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.of(new int[]{1, 1, 2, 3, 1, 3, 4}, false));
        out.add(Arguments.of(new int[]{1, 1, 2, 2}, true));
        out.add(Arguments.of(new int[]{1, 1, 1, 1}, false));
        out.add(Arguments.of(new int[]{}, false));
        return out.stream();
    }

}