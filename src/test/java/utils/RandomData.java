package utils;


import com.github.javafaker.Faker;

public class RandomData {

    Faker faker = new Faker();
    public String snacks = "Закуски";
    public String cookies = "Десерты";
    public String aboutUs = "О нас";
    public String city = faker.options().option("Москва", "Таганрог", "Санкт-Петербург", "Абакан");
    public String town = faker.options().option("Москва", "Таганрог", "Санкт-Петербург", "Абакан");
    public String incorrectTown = faker.options().option("Новый город");
    public Integer pizzaSize = faker.options().option(1, 2);
    public String snack = faker.options().option("Супермясной Додстер", "Острый Додстер", "Додстер Карри");
    public String dough = faker.options().option("Традиционное", "Тонкое");
    public String firstPizza = faker.options().option("Пепперони фреш", "Ветчина и сыр", "Чоризо фреш");
    public String secondPizza = faker.options().option("Пепперони фреш", "Ветчина и сыр", "Чоризо фреш");
    public String thirdPizza = faker.options().option("Пепперони фреш", "Ветчина и сыр", "Чоризо фреш");
    public String cookie = faker.options().option("Слоеные палочки с брусникой и клюквенным соусом", "Слоеные палочки с ананасами и брусникой");
}