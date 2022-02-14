import java.time.LocalDate;

public class ArrayUtil {
    public static void main(String[] args) {
        Integer[] unsorted = new Integer[]{155,12,44};
        Integer[] sorted = new Integer[]{12,44,55};
        LocalDate[] unsortedDates = new LocalDate[]{
                LocalDate.of(2021,8,2),
                LocalDate.of(2019,11,3),
                LocalDate.of(2020,3,1),
        };
        LocalDate[] sortedDates = new LocalDate[]{
                LocalDate.of(2020,8,2),
                LocalDate.of(2020,10,6),
                LocalDate.of(2020,11,12),
        };
        String[] unsortedString = new String[]{"4","2","3"};
        String[] sortedString = new String[]{"1","2","3"};
        System.out.println(ArrayUtil.isSorted(sortedString));
        System.out.println(ArrayUtil.isSorted(unsortedString));
        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(unsortedDates));
        System.out.println(ArrayUtil.isSorted(sorted));
        System.out.println(ArrayUtil.isSorted(unsorted));


    }

    public static <T extends Comparable<T>> boolean isSorted(T[] ar){
        for (int i = 0; i< ar.length-1; i++)
            if (ar[i+1].compareTo(ar[i])<0) return false;
            return true;
    }

    }

