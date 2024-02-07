
let n = Number.parseInt(prompt("Введите n:"))

let mas = [];

for (let i = 0; i < n; i++) {
    mas.push(prompt("Введите число" + i)*1);
}

let mas2 = [];

for (let i = 0; i < mas.length; i++) {
    mas2[i] = mas[i] * mas[i];
}

alert(mas2)