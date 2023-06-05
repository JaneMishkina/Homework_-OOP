public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.printf("тарелка: %d\n", food);
    }

    public int getFood() {
        return 0;
    }

    public void setFood(Object object) {
    }

public void feedCat(int amount) {
        this.food += amount;
        System.out.printf("Добавлено %d корма в миску, теперь в миске %d еды.\n", amount, food);
}

public boolean eatFood(int amount) {
    if (this.food < amount) {
            System.out.println("\nНедостаточно еды - кот не намерен столько есть.");
            return false;
    }
    this.food -= amount;
    System.out.printf("\nУдалено %d еды из миски, теперь в миске %d еды.\n", amount, food);
    return true;
}

}

