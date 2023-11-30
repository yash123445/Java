import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class averageinteger {

    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,5,4,78,12);
        System.out.println("List of the numbers: "+ nums);

        //calculate the avarage using streams

        double average = nums.stream().mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average value of the said numbers: "+ average);
    }
}
