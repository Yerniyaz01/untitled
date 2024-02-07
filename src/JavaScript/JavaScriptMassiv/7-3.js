
let mas = [];
let a = 0;

mas.push(prompt("Vvedite chislo: ")*1);
while (mas[a]!==0) {
    a++;
    mas.push(prompt("Vvedite chislo: ")*1);
}
mas.pop();

let pol = [];
for (let el of mas) {
    if (el>0){
        pol.push(el);
    }
}
alert(pol);