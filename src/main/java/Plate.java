public class Plate {
    private int food;
    private int foodMax;

    public Plate(int food, int foodMax) {
        this.food = food;
        this.foodMax = foodMax;
    }

    public boolean decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.print("В тарелке не хватает еды...");
            food = food;
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void IncFood(int pourIn) {
        if (food + pourIn >= foodMax) {
            food = foodMax;
            System.out.println("Тарелка заполнена до максимума: " + food);
        } else {
            food += pourIn;
            System.out.println("Тарелка получила добавку. Теперь еды: " + food);
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}