
let n = prompt("Vvedite n: ")*1

let mas = [];

for (let i = 0; i < n; i++) {
    mas.push(prompt("Vvedite chislo " + i)*1);
}

let m = prompt("Vvedite m: ")*1;
let check = false;

for (let i = 0; i < mas.length; i++) {
    if (m === mas[i]) {
        alert("Yes " + i);
        check = true;
        break;
    }
}
if (check === false) {
    alert("No")
}


