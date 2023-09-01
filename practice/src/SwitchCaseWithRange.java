public class SwitchCaseWithRange {

    public static void main(String[] args) {
        int number = 75;

        switch (number) {
            case 0, 1, 2, 3, /* ... */, 49:
                System.out.println("Number is in the range 0-49");
                break;
            case 50, 51, 52, /* ... */, 74:
                System.out.println("Number is in the range 50-74");
                break;
            case 75, 76, 77, /* ... */, 100:
                System.out.println("Number is in the range 75-100");
                break;
            default:
                System.out.println("Number is out of range");
        }
    }
}
