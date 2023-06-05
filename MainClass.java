
public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Барон", 10),
            new Cat("Граф", 12),
            new Cat("Герцог", 16),
            new Cat("Кардинал", 14),
            new Cat("Король", 18),
};

Plate plate = new Plate(0);
    plate.feedCat(40);

    for (Cat catty : cats) {
        catty.eat(plate);
        System.out.printf("Кот %s -  сытость %s\n", catty.getName(), catty.isFull());
}
}
}

