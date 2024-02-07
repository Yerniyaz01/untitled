
let mas = [];
let a = 0;

mas.push(prompt("Vvedite chislo: ")*1);
while (mas[a]!==0) {
    a++;
    mas.push(prompt("Vvedite chislo: ")*1);
}
mas.pop();

let sum = 1;
for (let el of mas) {
    sum = sum * el;
}
sum = Math.pow(sum, 1/mas.length);
alert(sum);