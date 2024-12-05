import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] boxPlace = places(random);
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