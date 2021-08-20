import GeneratingPatterns.AbstractFactory.AbstractCarFactory;
import GeneratingPatterns.AbstractFactory.AbstractFourDoorsFactory;
import GeneratingPatterns.AbstractFactory.AbstractTwoDoorsFactory;
import GeneratingPatterns.Builder.IngredientBuilder;
import GeneratingPatterns.Builder.Ingredients;
import GeneratingPatterns.Builder.Pizza;
import GeneratingPatterns.FactoryMethod.Toy;
import GeneratingPatterns.FactoryMethod.ToyFactory;
import GeneratingPatterns.FactoryMethod.ToyType;
import GeneratingPatterns.Prototype.SmartPhone;
import GeneratingPatterns.Prototype.SmartphonePrototype;
import GeneratingPatterns.Singleton.DBSingleton;
import StructuralPatterns.Adapter.ChargeAdapter;
import StructuralPatterns.Adapter.EuroCharge;
import StructuralPatterns.Adapter.Laptop;
import StructuralPatterns.Adapter.USCharge;
import StructuralPatterns.Adapter.USChargeImpl;
import StructuralPatterns.Bridge.BrickWallCreator;
import StructuralPatterns.Bridge.BuildingCompany;
import StructuralPatterns.Bridge.ConcreteSlabWallCreator;
import StructuralPatterns.Bridge.LeoniBuldingCompany;
import StructuralPatterns.Composite.Component;
import StructuralPatterns.Composite.GroupComponent;
import StructuralPatterns.Composite.Rectangle;
import StructuralPatterns.Composite.Circle;
import StructuralPatterns.Decorator.AmbulanceCar;
import StructuralPatterns.Decorator.Car;
import StructuralPatterns.Decorator.MercedesCar;
import StructuralPatterns.Facade.HotelFacade;
import StructuralPatterns.Flyweight.Parser;
import StructuralPatterns.Flyweight.Unit;
import StructuralPatterns.Proxy.RobotBombDefuser;
import StructuralPatterns.Proxy.RobotBombDefuserProxy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        abstractFactoryPattern();
        builderPattern();
        factoryMethodPattern();
        prototypePattern();
        singletonPattern();
        adapterPattern();
        bridgePattern();
        compositePattern();
        decoratorPattern();
        facadePattern();
        flyweightPattern();
        proxyPattern();
    }

    /**
     * Проксі підміняє реальний об'єкт та надсилає запити до нього тоді,
     * коли це потрібно. Проксі також може ініціалізувати реальний об'єкт,
     * якщо він до того не існував.
     */
    private static void proxyPattern() {
        // Create proxy object, which just expands RobotBombDefuser class
        System.out.println();
        RobotBombDefuserProxy proxy = new RobotBombDefuserProxy(41);
        proxy.walkStraightForward(100);
        if (!proxy.isLostConnection()) {
            proxy.turnRight();
        }
        if (!proxy.isLostConnection()) {
            proxy.walkStraightForward(5);
        }
        if (!proxy.isLostConnection()) {
            proxy.defuseBomb();
        }
        System.out.println();
        // If connection to proxy is lost, we initialize object from class RobotBombDefuser
        if (proxy.isLostConnection()) {
            System.out.println("Exception has been caught with message: \"No connection with remote bomb " +
                    "diffuser robot\".\nDecided to have human operate robot there.");
            RobotBombDefuser humanOperatingRobotDirectly = new RobotBombDefuser();
            humanOperatingRobotDirectly.walkStraightForward(100);
            humanOperatingRobotDirectly.turnRight();
            humanOperatingRobotDirectly.walkStraightForward(5);
            humanOperatingRobotDirectly.defuseBomb();
        }
    }

    /**
     * Легковаговик забезпечує підтримку великої кількості об’єктів шляхом
     * виокремлення спільної інформації для збереження в одному
     * екземплярі.
     */
    private static void flyweightPattern() {
        System.out.println();
        Parser parser = new Parser();
        // We have many Unit objects and every object has image
        // We used flyweight pattern for creating picture only once for different type of Unit
        // and set it to each object with appropriate type
        List<Unit> unitList = parser.getAllUnits();
        System.out.println(unitList.size());
    }

    /**
     * Фасад надає єдину «точку доступу» до підсистеми, тим самим
     * спрощуючи її використання та розуміння.
     * Цей дизайн-патерн можна розглядати як наступний рівень такого важливого
     * принципу як інкапсуляція. Просто на цьому рівні ми інкапсулюємо цілу
     * підсистему.
     */
    private static void facadePattern() {
        System.out.println();
        HotelFacade hotelFacade = new HotelFacade();

        // HotelFacade include three classes which are encapsulate
        // We have access only for this methods
        hotelFacade.getAllInclusiveRestForOnePerson();
        hotelFacade.getAllInclusiveRestPrice(3);
        hotelFacade.getTheCheaperRestForOnePerson();
    }

    /**
     * Декоратор використовується для надання деякої додаткової
     * функціональності нашим об'єктам.
     */
    private static void decoratorPattern() {
        System.out.println();
        // We can add additional functionality in DecoratorCar class
        Car doctorsCar = new AmbulanceCar(new MercedesCar());
        doctorsCar.drive();
    }

    /**
     * Компонувальник дозволяє нам зберігати деревовидну структуру і
     * працювати однаково із батьками та синами у дереві.
     */
    private static void compositePattern() {
        System.out.println();
        // We can create group of component and add components to them
        Component groupOfAllComponents = new GroupComponent();
        Component rect = new Rectangle();
        groupOfAllComponents.add(rect);

        // Also we can add new group of component as new component
        Component groupOfComponents = new GroupComponent(new Rectangle(), new Circle(), new Circle());
        groupOfAllComponents.add(groupOfComponents);
        // We should see in a raw : rectangle, rectangle, circle, circle
        groupOfAllComponents.draw();
    }

    /**
     * Міст дозволяє розділити імплементацію від її абстракції, таким чином
     * реалізація може бути змінена окремо від абстракції, оскільки вона не
     * наслідується від неї напряму.
     */
    private static void bridgePattern() {
        System.out.println();
        BuildingCompany buildingCompanyByBrick = new LeoniBuldingCompany(new BrickWallCreator());
        BuildingCompany buildingCompanyByConcrete = new LeoniBuldingCompany(new ConcreteSlabWallCreator());

        // Should build house by bricks
        buildingCompanyByBrick.buildFoundation();
        buildingCompanyByBrick.buildRoom();
        buildingCompanyByBrick.buildRoof();

        System.out.println();
        // Should build house by concrete
        buildingCompanyByConcrete.buildFoundation();
        buildingCompanyByConcrete.buildRoom();
        buildingCompanyByConcrete.buildRoof();
    }

    /**
     * Адаптер надає можливість користуватися об’єктом, який не є
     * прийнятним у нашій системі і який не можна змінити. Ми адаптуємо
     * його функціональність через інший, відомий нашій системі, інтерфейс.
     */
    private static void adapterPattern() {
        System.out.println();
        // Should charge with 180V
        USCharge usCharge = new USChargeImpl();
        Laptop.chargeLaptop(usCharge);

        // We can't use euroCharge in chargeLaptop method
        // We need to adapt it
        // Should charge with 220V
        EuroCharge euroCharge = new EuroCharge();
        Laptop.chargeLaptop(new ChargeAdapter(euroCharge));
    }

    /**
     * Одинак забезпечує існування єдиного екземпляру класу та єдиного
     * доступу до нього.
     */
    private static void singletonPattern() {
        // We don't have opportunity to create new object of DBSingleton class
        // We can only take the same instance of DBSingleton class
        DBSingleton dbSingletonInstance1 = DBSingleton.getInstance();
        DBSingleton dbSingletonInstance2 = DBSingleton.getInstance();

        // We should see the same message with the same port
        dbSingletonInstance1.getConnection();
        dbSingletonInstance2.getConnection();
    }

    /**
     * Прототип дозволяє нам створювати копії об’єктів, що уже визначені на
     * стадії дизайну (наприклад, список можливих типів зустрічей) або ж
     * визначаються під час виконання програми («п’ятнична вечірка»), таким
     * чином, відпадає необхідність заповняти всі елементи об’єкту від «А» до
     * «Я». Вже створені або визначені екземпляри об’єкту називаються
     * прототипічними екземплярами (prototypical instances).
     */
    private static void prototypePattern() {
        SmartPhone existingSmartPhone = SmartphonePrototype.getExistingSmartPhone();
        SmartPhone smartPhoneCopied = existingSmartPhone.clone();
        smartPhoneCopied.setName("Iphone 12 Pro");
        smartPhoneCopied.setMemory("512GB");

        // Should return Iphone 11 Pro with 256GB memory and ISO operation system
        // Changed values in copied object, should not have influence on this one
        System.out.println("\nExisting smartphone:");
        System.out.println(existingSmartPhone);

        // Should return Iphone 12 Pro with 512GB memory
        // Operation system should be IOS (this value copied from existing object)
        System.out.println("Copied smartphone:");
        System.out.println(smartPhoneCopied);
    }

    /**
     * Фабричний Метод вирішує, яку реалізацію інстанціювати. Вирішують
     * або нащадки фабричного методу, або він сам, приймаючи якийсь
     * параметер.
     */
    private static void factoryMethodPattern() {
        Toy toyCat = ToyFactory.getToy(ToyType.CAT);
        Toy toyDog = ToyFactory.getToy(ToyType.DOG);

        // Should say hello and goodbye from CatToy class
        System.out.println("CAT:");
        System.out.println(toyCat.sayHello());
        System.out.println(toyCat.sayGoodbye());

        // Should say hello and goodbye from DogToy class
        System.out.println("DOG:");
        System.out.println(toyDog.sayHello());
        System.out.println(toyDog.sayGoodbye());
    }

    /**
     * Будівельник вимальовує стандартний процес створення складного
     * об’єкта, розділяючи логіку будування об’єкта від його представлення.
     */
    private static void builderPattern() {
        Ingredients ingredients = IngredientBuilder.builder()
                .ananas(true)
                .biff(true)
                .corn(true)
                .lem(true)
                .build();
        Pizza pizza = new Pizza(50, ingredients, "barbecue");

        // pizza should have ananas, biff, corn and lem values as true, others - as false
        System.out.println(pizza);
    }

    /**
     * Абстрактна фабрика надає простий інтерфейс для створення об’єктів,
     * які належать до того чи іншого сімейства.
     */
    private static void abstractFactoryPattern() {
        System.out.println("AbstractCarFactory\n");

        AbstractCarFactory twoDoorsFactory = new AbstractTwoDoorsFactory();
        AbstractCarFactory fourDoorsFactory = new AbstractFourDoorsFactory();

        // Both should return 2
        System.out.println("TwoDoorsFactory");
        System.out.println("Audi doors number: " + twoDoorsFactory.getAudi().getDoorsNumber());
        System.out.println("BMW doors number: " + twoDoorsFactory.getBMW().getDoorsNumber());

        // Both should return 4
        System.out.println("\nFourDoorsFactory");
        System.out.println("Audi doors number: " + fourDoorsFactory.getAudi().getDoorsNumber());
        System.out.println("BMW doors number: " + fourDoorsFactory.getBMW().getDoorsNumber());
        System.out.println("\n");
    }
}
