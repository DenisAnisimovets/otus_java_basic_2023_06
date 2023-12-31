package homework22;

public class ArrayUtil {

    public static int[] makeNewArray(int[] oldArray) {
        int last1 = -1;
        for (int i = 0; i < oldArray.length; i++) {
            if(oldArray[i] == 1) {
                last1 = i;
            }
        }

        if(last1 < 0) {
            throw new RuntimeException("Нет единиц в массиве!");
        }

        int[] arr = new int[oldArray.length - last1 - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = oldArray[i + oldArray.length - arr.length];
        }
        return arr;
    }

    public static boolean isArrayContainsFrom1and2(int[] array) {
        boolean isHave1 = false;
        boolean isHave2 = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1 ) {
                isHave1 = true;
            } else if(array[i] == 2) {
                isHave2 = true;
            }
            else {
                return false;
            }
        }
        if(isHave1&&isHave2) return true;
        else {
            return false;
        }
    }

}

