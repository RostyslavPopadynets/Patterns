import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import BehaviourPatterns.ChainOfResponsibility.BestFriend;
import BehaviourPatterns.ChainOfResponsibility.Food;
import BehaviourPatterns.ChainOfResponsibility.GirlFriend;
import BehaviourPatterns.ChainOfResponsibility.Me;
import BehaviourPatterns.Command.Command;
import BehaviourPatterns.Command.Customer;
import BehaviourPatterns.Command.HeroDeveloper;
import BehaviourPatterns.Command.HeroDeveloperCommand;
import BehaviourPatterns.Command.Requirement;
import BehaviourPatterns.Command.Team;
import BehaviourPatterns.Command.YouAsProjectManagerCommand;
import BehaviourPatterns.Iterator.Facebook;
import BehaviourPatterns.Iterator.Profile;
import BehaviourPatterns.Iterator.SocialNetwork;
import BehaviourPatterns.Iterator.SocialSpammer;
import BehaviourPatterns.Mediator.Button;
import BehaviourPatterns.Mediator.Fan;
import BehaviourPatterns.Mediator.Mediator;
import BehaviourPatterns.Mediator.PowerSupplier;
import BehaviourPatterns.Memento.Caretaker;
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
import StructuralPatterns.Composite.Circle;
import StructuralPatterns.Composite.Component;
import StructuralPatterns.Composite.GroupComponent;
import StructuralPatterns.Composite.Rectangle;
import StructuralPatterns.Decorator.AmbulanceCar;
import StructuralPatterns.Decorator.Car;
import StructuralPatterns.Decorator.MercedesCar;
import StructuralPatterns.Facade.HotelFacade;
import StructuralPatterns.Flyweight.Parser;
import StructuralPatterns.Flyweight.Unit;
import StructuralPatterns.Proxy.RobotBombDefuser;
import StructuralPatterns.Proxy.RobotBombDefuserProxy;

public class Main {

    public static void main(String[] args) {
        runGeneratingPatterns();
        runStructuralPatterns();
        runBehaviourPatterns();
    }

    /**
     * Основним завданням породжуючих патернів є спростити створення об’єктів.
     * Інколи ви працюєте із певним набором об’єктів через групу інтерфейсів. А
     * тоді хочете створювати об’єкти тільки із іншого набору, щоб пристосувати ваш
     * код до інших умов. Звичайно, група інтерфейсів, через які ви оперуєте,
     * залишається та ж сама. Спростити створення відповідного набору допоможе
     * Абстрактна Фабрика.
     * А інколи структура деякого об’єкта дуже складна і залежить від багатьох
     * чинників. Щоб спростити створення такого об’єкту зазвичай використовують
     * Будівельника.
     * А щоб зручно вибрати одну реалізацію та інстанціювати її, відштовхуючись
     * від простої умови, можна використати Фабричний Метод.
     * Нерідко постає завдання отримати копію уже існуючого об’єкта, або
     * отримати можливість швидко генерувати багато подібних екземплярів. У
     * такому випадку Прототип якраз згодиться.
     * Вибагливе множення об’єктів — не єдине завдання, яке вам слід буде
     * виконувати у роботі: вам часто потрібно буде робити все точно навпаки – мати
     * один-єдиний екземпляр об’єкта і, ні за яких обставин, не допустити створення
     * або звертання до ще одного екземпляру. Функціональність єдиного екземпляра
     * забезпечуються Одинаком.
     */
    private static void runGeneratingPatterns() {
        abstractFactoryPattern();
        builderPattern();
        factoryMethodPattern();
        prototypePattern();
        singletonPattern();
    }

    /**
     * Основним завданням структурних патернів є формування найбільш
     * підходящої структури та взаємодії між класами для виконання певних завдань.
     * Якщо потрібно, щоб один об’єкт міг бути зрозумілим під іншим
     * інтерфейсом, використовується Адаптер.
     * Якщо ви хочете розділити абстракцію та імплементацію так, що на одному
     * боці ви матимете абстракцію, а на іншому декілька реалізацій, причому, всі
     * доступні до модифікацій, то слід задуматися над поєднанням таких незалежних
     * абстракції та реалізації за допомогою патерну Міст.
     * Якщо елемент містить собі подібні елементи, а вони, в свою чергу, також
     * можуть містити елементи, то таку структуру найлегше реалізувати за
     * допомогою Компонувальника.
     * Для швидкої та динамічної можливості розширення існуючої
     * функціональності, без зміни її носія, можна скористатися Декоратором.
     * Якщо ваша система використовує багато об’єктів, що мають спільні дані, то
     * такі дані можна винести та зробити загальнодоступними для економії пам’яті за
     * допомогою патерну Легковаговик.
     * Якщо відсутня можливість працювати із об’єктом напряму, використайте
     * Проксі, що дозволить донести ваші команди до пункту призначення.
     */
    private static void runStructuralPatterns() {
        adapterPattern();
        bridgePattern();
        compositePattern();
        decoratorPattern();
        facadePattern();
        flyweightPattern();
        proxyPattern();
    }

    /**
     * Патерни поведінки акцентують свою увагу на поведінці.
     * Вони або інкапсулюють поведінку, або дозволяють її розподілити.
     * Щоб забезпечити почергову передачу роботи від одного класу до іншого і
     * так далі, аж до поки робота не буде виконана, використовують Ланцюжок
     * Відповідальностей.
     * Інколи краще запакувати інформацію про дії, які слід виконати, в один
     * об’єкт Команди і переслати на опрацювання, або ж просто виконати в
     * потрібному місці.
     * Багато явищ можна описати за допомогою якоїсь спеціальної мови,
     * наприклад, погодні умови можуть бути записані значками, зрозумілими тільки
     * метеорологам, але, якщо вам подана граматика цієї мови і пояснення значків,
     * цілком можливо, що ви зможете Інтерпретувати метеорологічне речення і
     * зрозуміти його суть.
     * Колекції об’єктів можуть бути «хитрими» і містити багато підколекцій та
     * поокремих об’єктів. Щоб спростити життя користувачу такої колекції та щоб не
     * викривати логіки колекції, придумали Ітератор, який допомагає легко і
     * грамотно обійти усі об’єкти всередині.
     * Спрощення коодинації роботи між деякою кількістю об’єктів може бути
     * досягнуте виділенням посередника або медіатора. Медіатором може бути ваш
     * бригадир на будівництві або ваш менеджер.
     * Можливість повернутися до попереднього стану системи має велике
     * значення. Така функціональність може бути досягнута Хранителем.
     * Зверху завжди видніше, що коїться знизу. Спостерігач допоможе
     * централізувати огляд роботи декількох класів та генерувати відповідні події.
     * Стан системи та умови переходу між ними можуть бути винесені в окремі
     * класи для легшого контролю над цією системою. Все це досягається за
     * допомогою дизайн-патерну Стан.
     * Піти направо чи наліво, а чи взагалі кудись йти? Відповідь на це питання
     * може залежати від певних параметрів і є нічим іншим як певною Стратегією.
     * Втомились від одноманітної роботи, яка завжди шаблонна, окрім деталей,
     * які час від часу міняються? Віддайте цю робому Шаблонному Методу.
     * Коли потрібно виконати деякі дії над об’єктом, причому вони кожного разу
     * різні, такі дії можуть бути винесені в окремі класи-відвідувачі. Опісля ваш
     * об’єкт може приймати Відвідувачів для виконання конкретних дій.
     */
    private static void runBehaviourPatterns() {
        сhainOfResponsibilityPattern();
        commandPattern();
        iteratorPattern();
        mediatorPattern();
        mementoPattern();
    }

    /**
     * Хранитель використовується тоді, коли ви хочете відмінити операції
     * без відображення внутрішньої структури Хазяїна (Originator — гра у
     * нашому прикладі). Координація операцій здійснюється Опікуном
     * (Caretaker — контроллер гри), який надає можливість простого
     * збереження миттєвих станів системи без уявлення що ці стани собою
     * являють.
     */
    private static void mementoPattern() {
        System.out.println();
        Caretaker caretaker = new Caretaker();

        caretaker.save();
        caretaker.shootThatDumbAss();
        caretaker.save();
        caretaker.shootThatDumbAss();
        caretaker.shootThatDumbAss();
        caretaker.shootThatDumbAss();
        caretaker.shootThatDumbAss();
        // Should return last saved state
        System.out.println("Loaded state: ");
        caretaker.load();
        caretaker.shootThatDumbAss();
    }

    /**
     * Медіатор централізує взаємодію між компонентами, таким чином
     * послаблюючи їхню зв’язність.
     * Патерн Посередник змушує об’єкти спілкуватися через окремий об’єкт-посередник,
     * який знає, кому потрібно перенаправити той або інший запит.
     * Завдяки цьому компоненти системи залежатимуть тільки від посередника,
     * а не від десятків інших компонентів.
     */
    private static void mediatorPattern() {
        System.out.println();
        // Ми використовуємло тільки метод press, клас Button має в собі медіатор,
        // який організовує взаємодію між іншими елементами
        Button button = new Button(new Mediator(new Fan(new PowerSupplier())));
        for (int i = 0; i < 5; i++) {
            button.press();
        }
    }

    /**
     * Ітератор дозволяє доступатися почергово до елементів будь-якої
     * колекції без вникання в суть її імплементації.
     */
    private static void iteratorPattern() {
        System.out.println();
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith",
                "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian",
                "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie",
                "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day",
                "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting",
                "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza",
                "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        SocialNetwork network = new Facebook(data);
        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
    }

    /**
     * Команда дозволяє інкапсулювати всю інформацію, необхідну для
     * виконання певних операцій, які можуть бути виконані пізніше,
     * використавши об’єкт команди. Команда інкапсулює
     * інформацію і надає назовні один метод для виконання дій.
     */
    private static void commandPattern() {
        System.out.println();
        // Замовник
        Customer customer = new Customer();
        // Команда Undefined
        Team team = new Team("Undefined", 5);
        // Список вимог, що треба буде передати команді Undefined
        List<Requirement> requirements = Arrays.asList(
                new Requirement("Login", "Create login opportunity"),
                new Requirement("Contact", "Create contact page"));
        // Ви повинні бути готові бути викликаними замовником
        Command commandX = new YouAsProjectManagerCommand(team, requirements);
        // Передача вас у «найми» замовнику 
        customer.addCommand(commandX);
        // Супер-програміст компанії
        HeroDeveloper heroDeveloper = new HeroDeveloper("Rostyk","Java,Angular");
        // Бос вирішив віддати йому проект BillService
        Command commandA = new HeroDeveloperCommand(heroDeveloper, "BillService");
        customer.addCommand(commandA);
        // Як тільки замовник підписує контракт із вашим босом,
        // ваша команда і супер-програміст готові виконати все, що треба
        // згідно вихідного коду контракту
        customer.signContractWithBoss();
    }

    /**
     * Ланцюжок Відповідальностей забезпечує обробку об’єкта шляхом
     * передачі його по ланцюжку доти, доки не буде здійснена обробка
     * якоюсь із ланок.
     */
    private static void сhainOfResponsibilityPattern() {
        // The food will go ahead to the next class - if it's not needed for this one
        System.out.println();
        Food cappuccinoWithSugar = new Food("Cappuccino", Arrays.asList("Coffee", "Milk", "Sugar"));
        Food cappuccinoWithoutSugar = new Food("Cappuccino", Arrays.asList("Coffee", "Milk"));
        Food soupWithMeat = new Food("Soup with meat", Arrays.asList("Meat", "Water", "Potato"));
        Food soupWithoutMeat = new Food("Soup with potato", Arrays.asList("Water", "Potato"));
        Food meat = new Food("Meat", Collections.singletonList("Meat"));
        GirlFriend girlFriend = new GirlFriend(null);
        Me me = new Me(girlFriend);
        BestFriend bestFriend = new BestFriend(me);
        bestFriend.handleFood(meat);
        bestFriend.handleFood(cappuccinoWithSugar);
        bestFriend.handleFood(cappuccinoWithoutSugar);
        bestFriend.handleFood(soupWithMeat);
        bestFriend.handleFood(soupWithoutMeat);
        bestFriend.handleFood(cappuccinoWithSugar);
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
