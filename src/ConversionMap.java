import java.util.HashMap;

public class ConversionMap {
    public static void main(String[] args) {
        HashMap<String, Integer> conversionMap = new HashMap<>();

        conversionMap.put("3", 9);
        conversionMap.put("6", 6);
        conversionMap.put("9", 3);

        if( conversionMap.get("9") == 3){
            System.out.println("Correct");
        }
    }
}
