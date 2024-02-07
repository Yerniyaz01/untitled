package JavaSE.TestClass;

public class Phone {
    String name;
    String model;
    int price;

    public Phone() {
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return name + " - " + model + " for " + price + " KZT";
    }

}

//Продолжайте работать над предыдущим классом Phone.
//Далее, создайте в этом классе метод String getData(), который возвращает все параметры (name, model, price) данного класса в следующем формате. К примеру, если у нас телефон с параметрами Iphone, 11 Pro, 400000, то результат возвращаемого текста должен быть:
//Iphone - 11 Pro for 400000 KZT