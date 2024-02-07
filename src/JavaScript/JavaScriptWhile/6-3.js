
let n = prompt("Vvedite n: ") *1;

let mas = [];

for (let i = 0; i < n; i++) {
    mas.push(prompt("Введите число " + i)*1);
}

let sum = 0;

for (let el of mas) {
    sum = sum + el;
}

alert(sum + " " + (sum/n))