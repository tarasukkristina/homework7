package by.it.academy.homework7;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> integerPair = new Pair<>(5, 10);

        System.out.println("Return first element: " + integerPair.getFirstElement());
        System.out.println("Return second element: " + integerPair.getSecondElement());

        integerPair.swap();
        System.out.println("Elements have been swapped: " + integerPair.getFirstElement() + " " + integerPair.getSecondElement());

        integerPair.replaceFirst(7);
        System.out.println("After replace first element: " + integerPair.getFirstElement() + " " + integerPair.getSecondElement());

        integerPair.replaceSecond(17);
        System.out.println("After replace second element: " + integerPair.getFirstElement() + " " + integerPair.getSecondElement());

    }
}
