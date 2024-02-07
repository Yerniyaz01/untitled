let mas = [
    {name: "Mercedes", year: 2000, engine: 2.8, price: 2000000},
    {name: "Mercedes", year: 2015, engine: 2.0, price: 23000000},
    {name: "Mercedes", year: 2008, engine: 3.2, price: 12000000},
    {name: "Toyota", year: 2007, engine: 2.0, price: 8000000},
    {name: "Toyota", year: 2011, engine: 4.7, price: 10000000},
    {name: "Toyota", year: 2020, engine: 3.5, price: 35000000},
    {name: "Mitsubishi", year: 2009, engine: 2.4, price: 2000000},
    {name: "Mitsubishi", year: 2010, engine: 1.6, price: 5000000},
    {name: "Mitsubishi", year: 2021, engine: 3.0, price: 15000000},
];

let a = 0;
a = prompt("INSERT [1] TO SEARCH BY NAME\n" +
    "INSERT [2] TO SEARCH BY YEAR\n" +
    "INSERT [3] TO SEARCH BY ENGINE VOLUME\n" +
    "INSERT [4] TO SEARCH BY PRICE\n " +
    "INSERT [0] TO EXIT")

while (a != 0) {
    if (a == 1) {
        let name = prompt("INSERT NAME OF CAR:");
        let byName = [];
        for (let i = 0; i < mas.length; i++) {
            if (name == mas[i].name) {
                byName.push(mas[i].name + " - " + mas[i].year + " - "
                    + mas[i].engine + " liters - " + mas[i].price + " KZT\n");
            }
        }
        alert(byName);
    }
    if (a == 2) {
        let startYear = prompt("INSERT YEAR START FROM:")*1;
        let finishYear = prompt("INSERT YEAR ENDS FROM:")*1;
        let byName = [];
        for (let i = 0; i < mas.length; i++) {
            if (startYear <= mas[i].year && finishYear >= mas[i].year) {
                byName.push(mas[i].name + " - " + mas[i].year + " - "
                    + mas[i].engine + " liters - " + mas[i].price + " KZT\n");
            }
        }
        alert(byName);
    }
    if (a == 3) {
        let startEngine = prompt("INSERT ENGINE VOLUME START FROM:")*1;
        let finishEngine = prompt("INSERT ENGINE VOLUME ENDS FROM:")*1;
        let byName = [];
        for (let i = 0; i < mas.length; i++) {
            if (startEngine <= mas[i].engine && finishEngine >= mas[i].engine) {
                byName.push(mas[i].name + " - " + mas[i].year + " - "
                    + mas[i].engine + " liters - " + mas[i].price + " KZT\n");
            }
        }
        alert(byName);
    }
    if (a == 4) {
        let startPrice = prompt("INSERT PRICE START FROM:");
        let finishPrice = prompt("INSERT PRICE ENDS FROM:");
        let byName = [];
        for (let i = 0; i < mas.length; i++) {
            if (startPrice <= mas[i].price && finishPrice >= mas[i].price) {
                byName.push(mas[i].name + " - " + mas[i].year + " - "
                    + mas[i].engine + " liters - " + mas[i].price + " KZT\n");
            }
        }
        alert(byName);
    }
    a = prompt("INSERT [1] TO SEARCH BY NAME\n" +
        "INSERT [2] TO SEARCH BY YEAR\n" +
        "INSERT [3] TO SEARCH BY ENGINE VOLUME\n" +
        "INSERT [4] TO SEARCH BY PRICE\n " +
        "INSERT [0] TO EXIT")
}