import java.util.*;

public class CollectionExercises {

    public static int totalVowels(ArrayList<String> list){
        if (list.size() == 0){
            return 0;
        }
        else {
            int countVowels = 0;
            for (String s : list) {
                String word = s.toLowerCase();
                for (int j = 0; j < word.length(); j++) {
                    char character = word.charAt(j);
                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                        countVowels++;
                    }
                }
            }
            return countVowels;
        }
    }

    public static int countUnique(List<Integer> list){
        if (list.size() == 0){
            return 0;
        }
        else{
            HashSet<Integer> uniqueList = new HashSet();
            uniqueList.addAll(list);
            return uniqueList.size();
        }
    }

    public static int minLength(HashSet<String> set){
        Iterator<String> itr = set.iterator();
        int minStringLength = itr.next().length();
        while(itr.hasNext()){
            String temp = itr.next();
            if(temp.length() < minStringLength){
                minStringLength = temp.length();
            }
        }
        return minStringLength;
    }

    public static void removeOddLength(HashSet<String> set){
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 != 0) {
                iterator.remove();
            }
        }
        //Even better:
        // set.removeIf(element -> element.length() % 2 != 0);
    }

    public static boolean contains3(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isUnique(Map<String, String> input) {
        Set<String> uniqueValues = new HashSet<>();
        for (String value : input.values()) {
            if (uniqueValues.contains(value)) {
                return false;
            }
            uniqueValues.add(value);
        }
        return true;
    }
}
