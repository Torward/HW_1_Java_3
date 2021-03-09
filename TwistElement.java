import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  TwistElement {
    private static <S> void twist(S[]arr, int indexX, int indexY){
        List<S> list = Arrays.asList(arr);
        Collections.swap(list, indexX, indexY);
        arr = (S[]) list.toArray();
    }
    public static void main(String[] args) {
        String[] arr = {"Аэрофлот предложил", "убрать", "из цены", "на авиабилеты", "стоимость", "регистрации"};
        String[] arr2 = {"Аэрофлот предложил", "убрать", "из цены", "на авиабилеты", "стоимость", "регистрации"};

        twist(arr, 1, 2);
        System.out.println(Arrays.asList(arr));
        arrAsList(arr2);
    }
    private static <S> void arrAsList(S[]arr){

        List <S> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
