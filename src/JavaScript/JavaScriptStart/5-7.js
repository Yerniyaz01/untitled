
let a = Number.parseInt(prompt("Vvedite KM/chas:"));
let b = Number.parseInt(prompt("Vvedite KM ostatok:"));

let c = b / a;

if (c < 2.25) {
    alert("YES, YOU CAN REACH");
} else {
    alert("NO, YOU CAN NOT REACH");
}

