package homeWorks.lesson4;

import org.junit.jupiter.api.Test;


public class HomeWork {
    @Test
    public void workingWithHomeWork() {
        Discount firstDiscont = new Discount();
        firstDiscont.setVolume(56);
        firstDiscont.setMinSum(5);

        System.out.println("HomeWork");
        System.out.println("1stDiscont");
        System.out.println(firstDiscont.getMinSum());

        House firstHouse = new House();
        firstHouse.setAddress("Riga");
        firstHouse.setFloorSpace(15);

        System.out.println(firstHouse.getAddress());
        System.out.println(firstHouse.getFloorSpace());

        Book firstBook = new Book();
        firstBook.setName("ABC");
        firstBook.setPrice(25);

        System.out.println("1stBook");
        System.out.println(firstBook.getPrice());

        Human firstHuman = new Human();
        firstHuman.setGender("male");
        firstHuman.setAge(23);

        System.out.println(firstHuman.getGender());
        System.out.println(firstHuman.getAge());

        Ladder firstLadder = new Ladder();
        firstLadder.setMaterial("al");
        firstLadder.setNomberOfSteps(5);

        System.out.println(firstLadder.getMaterial());
        System.out.println(firstLadder.getNomberOfSteps());

        Banknote firstBanknote= new Banknote();
        firstBanknote.setCurrencySymbol("$");
        firstBanknote.setColour("green");

        System.out.println(firstBanknote.getCurrencySymbol());
        System.out.println(firstBanknote.getColour());

        Month firstMount = new Month();
        firstMount.setAmountOfDay(31);
        firstMount.setMonthName("May");

        System.out.println(firstMount.getMonthName());
        System.out.println(firstMount.getAmountOfDay());

        QA2course firstQA2 = new QA2course();
        firstQA2.setLessonNumber(5);
        firstQA2.setPupilsNumber(50);

        System.out.println(firstQA2.getPupilsNumber());
        System.out.println(firstQA2.getPupilsNumber());

        Wood firstWood = new Wood();
        firstWood.setArea(1111111);
        firstWood.setQuantityOfThrees(99999999);

        System.out.println(firstWood.getArea());
        System.out.println(firstWood.getQuantityOfThrees());

        Motorcykle ktm =new Motorcykle();
        ktm.setModel(1190);
        ktm.setEngineType("L");

        System.out.println(ktm.getModel());
        System.out.println(ktm.getEngineType());







    }
}
