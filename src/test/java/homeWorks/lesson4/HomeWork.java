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
        System.out.println(firstDiscont.getVolume());
        System.out.println(firstDiscont.getMinSum());

        House firstHouse = new House();
        firstHouse.setAddress("Riga");
        firstHouse.setFloorSpace(123.56);
        firstHouse.setNomberOfFloors1(9);
        firstHouse.setVallColor("white");

        System.out.println("FirstHouse");
        System.out.println(firstHouse.getAddress());
        System.out.println(firstHouse.getFloorSpace());
        System.out.println(firstHouse.getNomberOfFloors1());
        System.out.println(firstHouse.getVallColor());

        Book firstBook = new Book();
        firstBook.setName("ABC");
        firstBook.setPrice(25);
        firstBook.setNumberOfLetter(549876982343L);
        firstBook.setNumberOfSheets(432);

        System.out.println("1th Book");
        System.out.println(firstBook.getName());
        System.out.println(firstBook.getPrice());
        System.out.println(firstBook.getNumberOfLetter());
        System.out.println(firstBook.getNumberOfSheets());

        Human firstHuman = new Human();
        firstHuman.setName("Mikluha");
        firstHuman.setGender('m');
        firstHuman.setAge(23);
        firstHuman.setGrowth(190.5F);

        System.out.println("1th Human");
        System.out.println(firstHuman.getName());
        System.out.println(firstHuman.getGender());
        System.out.println(firstHuman.getAge());
        System.out.println(firstHuman.getGrowth());

        Ladder firstLadder = new Ladder();
        firstLadder.setMaterial("al");
        firstLadder.setNomberOfSteps(5);
        firstLadder.setColor("aluminium-white");
        firstLadder.setWeight(10);

        System.out.println("First ladder");
        System.out.println(firstLadder.getColor());
        System.out.println(firstLadder.getMaterial());
        System.out.println(firstLadder.getNomberOfSteps());
        System.out.println(firstLadder.getWeight());

        Banknote firstBanknote = new Banknote();
        firstBanknote.setCurrencyName("dollar");
        firstBanknote.setCurrencySymbol('$');
        firstBanknote.setColour("green");
        firstBanknote.setCurrencyVolume(100);
        firstBanknote.setPriceInEuro(99);

        System.out.println("Banknote");
        System.out.println(firstBanknote.getCurrencySymbol());
        System.out.println(firstBanknote.getColour());
        System.out.println(firstBanknote.getCurrencyName());
        System.out.println(firstBanknote.getCurrencyVolume());
        System.out.println(firstBanknote.getPriceInEuro());

        Month firstMount = new Month();
        firstMount.setAmountOfDay(31);
        firstMount.setMonthName("May");
        firstMount.setSeason("Spring");
        firstMount.setAmountOfWeekends(4);

        System.out.println("Month");
        System.out.println(firstMount.getMonthName());
        System.out.println(firstMount.getMonthName());
        System.out.println(firstMount.getAmountOfDay());
        System.out.println(firstMount.getSeason());


        QA2course firstQA2 = new QA2course();
        firstQA2.setLessonNumber(5);
        firstQA2.setPupilsNumber(50);

        System.out.println("1th QA2 course");
        System.out.println(firstQA2.getPupilsNumber());
        System.out.println(firstQA2.getPupilsNumber());

        Wood firstWood = new Wood();
        firstWood.setArea(1111111);
        firstWood.setQuantityOfThrees(99999999);

        System.out.println("1th Wood");
        System.out.println(firstWood.getArea());
        System.out.println(firstWood.getQuantityOfThrees());

        Motorcykle firstMotorcykle = new Motorcykle();

        firstMotorcykle.setName("KTM");
        firstMotorcykle.setModel(1190);
        firstMotorcykle.setEngineType('L');
        firstMotorcykle.setTankVolume(23.0);
        firstMotorcykle.setEngineDisplacement(1189.0);

        System.out.println("1th KTM");
        System.out.println(firstMotorcykle.getName());
        System.out.println(firstMotorcykle.getModel());
        System.out.println(firstMotorcykle.getEngineType());
        System.out.println(firstMotorcykle.getTankVolume());
        System.out.println(firstMotorcykle.getEngineDisplacement());


    }
}
