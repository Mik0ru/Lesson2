import java.util.Random;
public class HW2 {
    public static void main(String[] args) {
        String person1 = permission(generateRandomAge(),30);
        System.out.println(person1);
        String person2 = permission(generateRandomAge(),20);
        System.out.println(person2);
        String person3 = permission(generateRandomAge(),15);
        System.out.println(person3);
        String person4 = permission(generateRandomAge(),40);
        System.out.println(person4);
        String person5 = permission(generateRandomAge(),-20);
        System.out.println(person5);

    }
    public static String permission (int personAge, int temperature) {
        if (personAge < 45 && personAge > 20 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (personAge < 20 && temperature > -20 && temperature <28) {
            return "Можно идти гулять";
        } else if (personAge > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        }else {
            return "Оставайтесь Дома ";
        }

    }
    public static int generateRandomAge(){
        Random rand = new Random();
        return rand.nextInt(100);
    }
}