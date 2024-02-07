
let n = prompt("Vvedite n:")*1;
let m = [];

for (let i = 0; i < n; i++) {
    m.push(prompt("Введите число " + i)*1);
}

let max = Number.MIN_SAFE_INTEGER;

for (let element of m) {
    if (max < element){
        max = element;
    }
}

alert(max);



