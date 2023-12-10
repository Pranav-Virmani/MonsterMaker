package Ques2;
import java.lang.reflect.Field;
import java.util.*;
 class CreateMonster {
	 public Monster makeMonster(Scanner scanner, String monsterName) {
        System.out.println("Enter traits for " + monsterName + ":");
        System.out.print("Eye Color: ");
        String eyeColor = scanner.nextLine();

        System.out.print("Feather Color: ");
        String featherColor = scanner.nextLine();

        System.out.print("Magical Abilities: ");
        String magicalAbilities = scanner.nextLine();

        System.out.print("Size: ");
        int size = scanner.nextInt();

        System.out.print("Strength: ");
        int strength = scanner.nextInt();
        System.out.print("Durability: ");
        int durability = scanner.nextInt();
        System.out.print("Weakness: ");
        scanner.nextLine();
        String weakness = scanner.nextLine();
        System.out.print("Aggression Level: ");
        int aggressionLevel = scanner.nextInt();
        scanner.nextLine();
        return new Monster(eyeColor, featherColor, magicalAbilities, size,
                strength, durability, weakness, aggressionLevel);
    }
}
