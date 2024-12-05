import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] boxPlace = places(random);
        int[] guessingBoxes = new int[3];

            for (int i = 0; i < 3; i++) {
                //System.out.print("Enter kilometer " + (i + 1) + ": ");
                guessingBoxes[i] = sc.nextInt();

            }
    }
    public static int[] places(Random random)
    {
        int[] cargoPlaces = new int[3];
        for (int i = 0; i < 3; i++)
        {
            cargoPlaces[i] = random.nextInt(7) + 1;
            System.out.print(cargoPlaces[i] + " ");
        }
        return cargoPlaces;
    }
}