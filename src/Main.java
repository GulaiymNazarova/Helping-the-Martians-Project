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
        boolean ifBoxFound = false;
        int countBoxes;
        int attemptsOfGuessing = 0;
        while (!ifBoxFound)
        {
            countBoxes = 0;
            for (int i = 0; i < 3; i++)
            {
                System.out.print("Enter kilometer " + (i + 1) + ": ");
                guessingBoxes[i] = sc.nextInt();
                if (guessingBoxes[i] < 1 || guessingBoxes[i] > 7)
                {
                    boolean check = false;
                    while (!check)
                    {
                        System.out.println("Incorrect input. Range 1-7.");
                        System.out.println("Enter kilometer " + (i + 1) + ": ");
                        guessingBoxes[i] = sc.nextInt();
                        if (guessingBoxes[i] > 0 && guessingBoxes[i] < 8)
                        {
                            check = true;
                        }

                    }
                    for (int j = 0; j < 3; j++)
                    {
                        for (int t = 0; t < 3; t++)
                        {
                            if (guessingBoxes[j] == boxPlace[t] )
                            {
                                countBoxes++;
                            }
                        }

                    }
                    System.out.println("Number of found boxes: " + countBoxes);
                    if (countBoxes == 3)
                    {
                        ifBoxFound = true;
                        System.out.println("Congratulations! You have found all boxes!");
                    }
                }
            }

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