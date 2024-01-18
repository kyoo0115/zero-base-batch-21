package CodingTest.OnBoardingDay4.Programmers;

import java.util.HashMap;
import java.util.Map;

public class Outfit {

//    public static void main(String[] args) {
//        String[][] inputArray = {
//                {"yellow_hat", "headgear"},
//                {"blue_sunglasses", "eyewear"},
//                {"green_turban", "headgear"}
//        };
//        System.out.println(solution(inputArray));
//    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> clothesCountMap = new HashMap<>();

        for (String[] pair : clothes) {
            String clothingType = pair[1];
            clothesCountMap.put(clothingType, clothesCountMap.getOrDefault(clothingType, 0) + 1);
        }

        int answer = 1;

        for (int count : clothesCountMap.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }
}
