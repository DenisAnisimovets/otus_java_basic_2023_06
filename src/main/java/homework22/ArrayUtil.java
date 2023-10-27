package homework22;

public class ArrayUtil {

    public int[] makeNewArray(int[] oldArray) {
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

    public boolean isArrayContainsFrom1and2(int[] array) {
        boolean isHave1or2 = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1 || array[i] == 2) {
                isHave1or2 = true;
            } else {
                return false;
            }
        }
        if(isHave1or2) return true;
        else {
            return false;
        }
    }

}

