public class MainClass {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 7, false);
        Cat murzic = new Cat("Мурзик", 5, false);
        Cat musya = new Cat("Муся", 8, false);
        Cat dusya = new Cat("Дуся", 3, false);
        Cat zigzag = new Cat("Зигзаг", 6, false);


        Plate plate = new Plate(20, 100);
        Cat[] cats = new Cat[5];
        cats[0] = barsik;
        cats[1] = murzic;
        cats[2] = musya;
        cats[3] = dusya;
        cats[4] = zigzag;



        while (!allsatiety(cats, plate))
        plate.IncFood(100);

    }



    public static boolean allsatiety(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()) {
                System.out.println("Кот " + cats[i].getName() + " не голоден");
            } else {
                cats[i].eat(plate);
                if (cats[i].isSatiety()) {
                    cats[i].infoCat();
                }else {
                    cats[i].infoCat();
                if (i==cats.length-1) return false;}
            }
        }
        return true;
    }
}