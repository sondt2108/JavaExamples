package methods;

enum Car {
    lamborghini, vinfast, audi, fiat, honda
}

enum Choice {
    Choice1, Choice2, Choice3
}

enum Animal {
    dog(100), cat(1), bird(21), chicken(5);

    private int price;

    Animal(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class enumAndSwitch {
    public static void main(String[] args) {
        // Use of enum & switch statement
        Car c;
        c = Car.vinfast;
        switch (c) {
            case lamborghini:
                System.out.println("You choose lamborghini!");
                break;
            case vinfast:
                System.out.println("You choose vinfast!");
                break;
            case audi:
                System.out.println("You choose audi!");
                break;
            case fiat:
                System.out.println("You choose fiat!");
                break;
            case honda:
                System.out.println("You choose honda!");
                break;
            default:
                System.out.println("I don't know your car.");
                break;
        }

        //

        Choice ch = Choice.Choice1;

        switch (ch) {
            case Choice1:
                System.out.println("Choice1 selected");
                break;
            case Choice2:
                System.out.println("Choice2 selected");
                break;
            case Choice3:
                System.out.println("Choice3 selected");
                break;
        }

        //

        System.out.println("All car prices:");
        for (Animal animal : Animal.values())
            System.out.println(
                    animal + " costs " + animal.getPrice() + " dollars.");
    }
}
