import java.util.Random;
public class HW2 {
    public static void main(String[] args) {
        String person = permission(generateRandomAge(),30);
        System.out.println(person);
         person = permission(generateRandomAge(),20);
        System.out.println(person);
         person = permission(generateRandomAge(),15);
        System.out.println(person);
         person = permission(generateRandomAge(),40);
        System.out.println(person);
         person = permission(generateRandomAge(),-20);
        System.out.println(person);

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