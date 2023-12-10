package Ques2;
import java.lang.reflect.Field;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		CreateMonster cmobj=new CreateMonster();
		BabyClass bcobj=new BabyClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of monsters you want to create:");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Monster> monsters = new ArrayList<>();

   
        for (int i = 0; i < n; i++) {
            monsters.add(cmobj.makeMonster(scanner, "Monster " + (i + 1)));
        }

       
        Set<Monster> babies = bcobj.makeBabyMonster(monsters);

       
        System.out.println("\nBaby Monsters Traits:");
        for (Monster babyMonster : babies) {
            bcobj.displayBabyMonster(babyMonster);
        }
    }
}
