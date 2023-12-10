package Ques2;
import java.util.*;
import java.lang.reflect.Field;

public class BabyClass {
	   Set<Monster> makeBabyMonster(List<Monster> parents) {
	        
	        Set<Monster> babies = new HashSet<>();
	        int n = parents.size();
	 
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                Monster parent1 = parents.get(i);
	                Monster parent2 = parents.get(j);

	                Monster babyMonster = Monster.createBabyMonster(parent1, parent2);

	            
	                while (babies.contains(babyMonster)) {

	                    babyMonster = Monster.createBabyMonster(parent1, parent2);
	                }

	                babies.add(babyMonster);

	            }
	        }


	        return babies;
	    }
	 void displayBabyMonster(Monster monster) {
	        Field[] fields = Monster.class.getDeclaredFields();

	        System.out.println("Monster Traits:");
	        for (Field field : fields) {
	            field.setAccessible(true);

	            try {
	                System.out.println(field.getName() + ": " + field.get(monster));
	            } catch (IllegalAccessException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        System.out.println();
	    }
}
