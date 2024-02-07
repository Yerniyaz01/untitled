let n = prompt("Vvedite n:") * 1;
let mas = [];

for (let i = 0; i < n; i++) {
    mas.push(prompt("Vvedite chislo:") * 1);
}
let mas2 = [];
for (let el of mas) {
    if (el > 0) {
        mas2.push(el);
    }
}
let sum = 1;
for (let i = 0; i < mas2.length; i++) {
    sum = sum * mas2[i];
}
alert(sum);
