package MakeTheDeadfishSwim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.*;

//time complexity:76 ms

class Solution2 
{
private static HashMap<Character,UnaryOperator<Integer>> commands = new HashMap<>();
    
    static {
      commands.put('i', x -> x + 1);
      commands.put('d', x -> x - 1);
      commands.put('s', x -> x * x);
    }

    public static int[] parse(String data) {
        ArrayList<Integer> output = new ArrayList<>();
        
        int value = 0;
        for(char command : data.toCharArray()) {
          if(command == 'o') {
            output.add(value);
          } else {
            value = commands.get(command).apply(value);
          }
        }
        
        return output.stream().mapToInt(x -> x).toArray();
    }
}
