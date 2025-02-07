package TwoDimenArray;

public class Main
{
    public static void main(String[] args) {


        Integer[][] firstArray = {{2,3}, {3,4}, {4,5}};
        Integer[][] secondArray = {{2,3}, {3,4}, {4,5}};
        TwoDimen first = new TwoDimen(firstArray);

        System.out.println(first.equals(secondArray));

        String[][] thirdArray = {{"Hello", "Goodbye"},
                                {"Hola", "Adios"},
                                {"Bonjour", "Au revoir"}};

        String[][] fourthArray = {{"Hello", "Goodbye"},
                                {"Ciao", "Addio"},
                                {"Bonjour", "Au revoir"}};

        TwoDimen third = new TwoDimen(thirdArray);

        System.out.println(third.equals(fourthArray));
    }
}
