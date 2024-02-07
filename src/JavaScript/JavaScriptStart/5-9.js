
let a = Number.parseInt(prompt("INSERT YOUR AMOUNT IN KZT: "));

let b = Number.parseInt(prompt("1- CONVERT TO USD\n" + "2- CONVERT TO EUR\n" + "3- CONVERT TO GBP"));

// (Курсы валют: USD - 380KZT, EUR - 430KZT, GBP - 480KZT)

let USD = a/380;  // USD
let EUR = a/430;  // EUR
let GBR = a/480;  // GBR

if (b === 1) {
    alert(a + " KZT = " + USD + " USD");
} if (b === 2) {
    alert(a + " KZT = " + EUR + " EUR");
} if (b === 3) {
    alert(a + " KZT = " + GBR + " GBR");
}

