import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : numbers) 
            {
                if (num % i == 0) {
                    count++;
                }
            }
            hm.put(i, count);
        }
        System.out.println("output: ");
        System.out.print("{");
        int size=hm.size();
        int i=0;
        for(Map.Entry<Integer, Integer> res: hm.entrySet()) {
        	System.out.print(res.getKey()+":"+res.getValue());
        	if(i<size-1) {
        		System.out.print(", ");
        	}
        	i++;
        }
        System.out.println("}");
    }
}

		
	
