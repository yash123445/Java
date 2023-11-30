import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertString {
    public static void main(String [] args ){
        List<String> strList = Arrays.asList("Yash", "Rohit", "Pawar");

        List <String> lowerCaseString  = strList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        List <String> upperCaseString = strList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Lower Case Strings: " + lowerCaseString);
        System.out.println("Upper Case Strings: " + upperCaseString);
    }
}
