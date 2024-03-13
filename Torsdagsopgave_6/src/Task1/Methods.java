package Task1;

public class Methods {

    public void methodA(String input) {
        System.out.println("J");

    }

    public String methodB(String letter) {
        return letter;

    }

    public void methodC(String mail) {
        if (mail.length() > 10) {
            System.out.println("v");
        } else {
            System.out.println("a");
        }

    }

    public void methodD(String number) {

        int num = Integer.parseInt(number);

        if (num > 10) {

            System.out.println("e");
            System.out.println("r");
        } else {
            System.out.println("s");
            System.out.println("j");
        }
    }
}
