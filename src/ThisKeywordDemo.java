import java.util.Scanner;

class ThisDemo {

    int value;
    public void setValue(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        if (sc.hasNextInt()) {
            int input = sc.nextInt();

            ThisDemo obj = new ThisDemo();
            obj.setValue(input);
            obj.display();
        }

        sc.close();
    }
}
