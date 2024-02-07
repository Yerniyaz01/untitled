
let n = prompt("Vvedite n:")*1;
let m = [];

for (let i = 0; i < n; i++) {
    m.push(prompt("Введите цифру " + i)*1);
}

let word = "";

for (let i = m.length-1; i >= 0; i--) {
    word += m[i] + " ";
}

alert(word);