import java.util.Scanner;

public class JavaLibs5026211162 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = input.next();

        System.out.println("Enter Your Friends Name");
        String friend = input.next();

        System.out.println("Enter your Age");
        int umur = input.nextInt();

        System.out.println("Name an Animal");
        String animal = input.next();

        System.out.println("Name your favorite colour");
        String color = input.next();

        System.out.println("Name your favorite Country");
        String country = input.next();

        System.out.println("Enter your biggest fav number");
        double price1 = input.nextDouble();

        System.out.println("Enter your smallest fav number");
        double price2 = input.nextDouble();

        double totalmoney = price1-(price1*price2/100);

        System.out.println("one word to people who spend much money");
        String word1 = input.next();

        System.out.println("What word would you use to say to beautiful scenery");
        String word2 = input.next();

        System.out.println("Once upon a time in the college.");
        System.out.println(name+ ": Hey bro why aren't you home yet? ");
        System.out.println(friend+ ": I still have a class until " +umur);
        System.out.println(name+ ": Bro why u always wear " +color+ " clothes with " +animal+ "?");
        System.out.println(friend+ ": i dunno i like this color and picture, btw i heard you just had a vacation from the Ab" +country);
        System.out.println(name+ ": Yeah, you right i just came from there.");
        System.out.println(friend+ ": What would you say from that countyr?");
        System.out.println(name+ ": I just want to say the country has " +word2+ " scenery.");
        System.out.println(friend+ ": I bet it was, how much u spend on that vacation?");
        System.out.println(name+ ": I spent approx $" +totalmoney+ " for 5 days in there.");
        System.out.println(friend+ ": whoaaa bro, that's pretty " +word1);
        System.out.println("And that's the conversation between the two students who meet each other");

    }
}