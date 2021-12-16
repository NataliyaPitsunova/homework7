public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;


    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (satiety == false) {
            if (p.decreaseFood(appetite)) {
                satiety = true;
            } else {
                satiety = false;
            }
        }
    }

    public void infoCat() {
        if (satiety) {
            System.out.println("Кот " + name + " поел " + satiety);
        } else {
            System.out.println("Кот " + name + " голодный " + satiety);
        }
    }
}
