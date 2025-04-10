import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    public static void sayHi(){
//        System.out.println("hi");
//    }
//
//    public static void sayHi(String name){
//        System.out.println("hi " + name);
//
//    }
    public static void main(String[] args){

//        Item preke = new Item();
//        preke.title = "Traktorius";
//        preke.description = "Gera yra, viskas veike";
//        preke.price = 5000.0;
//
//        System.out.println(preke.title + " " + preke.description + " " + preke.price);
//        System.out.println(preke);
//
//        Item katamaranas = new Item();
//        katamaranas.title = "Katamaranas";
//        katamaranas.description = "Paturbintas modelis";
//        katamaranas.price = 2700;
//        System.out.println(katamaranas.toString()); //pats automatiskai pasileidzia, nebutina rasyti
//
//        //statiniai metodai yra kvieciami per klase
//
//        sayHi();
//        Main.sayHi();
//        Main.sayHi("Vilmantas");
//        Math.random();
//        String vardas = "Jonas";
//        System.out.println(vardas.substring(1));
//        System.out.println(vardas.substring(1,4));
//
//
//        //dinaminiai objektai yra kvieciami per objekta
//
//        Item.classDescription();//statinis klases metodas, kvieciamas per klase, neturi nieko bendro su konkreciu objektu
//
//        Item preke2 = new Item(" Printeris", " ant daliu", 500);
//        System.out.println(preke2);


//        Building house = new Building();
//        house.year = 1976;
//        house.floors = 5;
//        house.flats = 60;
//        house.type = "Plytinis";
//
//        Building house2 = new Building();
//        house2.year = 2024;
//        house2.floors = 2;
//        house2.flats = 4;
//        house2.type = "Duju silikato blokeliu";
//
//        System.out.println(house.flatsPerFloor());
//        System.out.println(house2.flatsPerFloor());
//
//        System.out.println(house.buildingAge());
//        System.out.println(house2.buildingAge());
//
//
//        Car car = new Car();
//        car.setManufacturer("peugeot");
//        car.setColor("Pilka");
//        System.out.println(car.getManufacturer());
//        System.out.println(car.getColor());

        System.out.println("\n==========================UZDAVINIAI=================================");

        Book book = new Book();
        book.setTitle("The Fellowship of the Ring");
        book.setPages(423);
        book.setReleaseYear(1954);
        System.out.println(book.getTitle());
        System.out.println(book.getPages());
        System.out.println(book.getReleaseYear());
        System.out.println("=======================================");

        Book book1 = new Book();
        book1.setTitle("The Two Towers");
        book1.setPages(352);
        book1.setReleaseYear(1954);
        System.out.println(book1.getTitle());
        System.out.println(book1.getPages());
        System.out.println(book1.getReleaseYear());
        System.out.println("=======================================");

        Book book2 = new Book();
        book2.setTitle("The Return of the King");
        book2.setPages(416);
        book2.setReleaseYear(1955);
        System.out.println(book2.getTitle());
        System.out.println(book2.getPages());
        System.out.println(book2.getReleaseYear());
        System.out.println("=======================================");

        Book book3 = new Book("The Hunger Games", 374, 2008);
        System.out.println(book3.getTitle() + ", " + book3.getPages() + ", " + book3.getReleaseYear());

        Book book4 = new Book("Catching Fire", 391, 2009);
        System.out.println(book4.getTitle() + ", " + book4.getPages() + ", " + book4.getReleaseYear());

        Book book5 = new Book("Mockingjay", 390, 2010);
        System.out.println(book5.getTitle() + ", " + book5.getPages() + ", " + book5.getReleaseYear());
        System.out.println("=======================================");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
        System.out.println("=======================================");

        Plant plant = new Plant();
        plant.setName("Mint");
        plant.setLatinName("Mentha");
        plant.setAnnual(false);
        plant.setContinent("Eurasia, Americas, Asia, Africa, Australia");
        plant.setHeight(120);
        plant.setEdible(true);
        System.out.println(plant.getName());
        System.out.println(plant.getLatinName());
        System.out.println(plant.getAnnual());
        System.out.println(plant.getContinent());
        System.out.println(plant.getHeight());
        System.out.println(plant.getEdible());

        System.out.println("=======================================");

        Plant plant1 = new Plant();
        plant1.setName("Durian");
        plant1.setLatinName("Durio");
        plant1.setAnnual(false);
        plant1.setContinent("Asia");
        plant1.setHeight(4000);
        plant1.setEdible(true);
        System.out.println(plant1.getName());
        System.out.println(plant1.getLatinName());
        System.out.println(plant1.getAnnual());
        System.out.println(plant1.getContinent());
        System.out.println(plant1.getHeight());
        System.out.println(plant1.getEdible());

        System.out.println("=======================================");

        Plant plant2 = new Plant("Zinnia", "Zinnia elegans", true, "[Eurasia, Americas, Asia, Africa, Australia]", 10, false);
        System.out.println(plant2.getName() + ", " + plant2.getLatinName() + ", " + plant2.getAnnual() + ", " + plant2.getContinent() + ", " + plant2.getHeight() + ", " + plant2.getEdible());

        Plant plant3 = new Plant("Moss", "Bryophyta", false, "All", 3, false);
        System.out.println(plant3.getName() + ", " + plant3.getLatinName() + ", " + plant3.getAnnual() + ", " + plant3.getContinent() + ", " + plant3.getHeight() + ", " + plant3.getEdible());

        System.out.println("=======================================");
        
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant);
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);

        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i).toString());
        }
        System.out.println("=======================================");









































    }








































}