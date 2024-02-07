let a = Number.parseInt(prompt("Vvedite 1: "));
let b = Number.parseInt(prompt("Vvedite 2: "));
let c = Number.parseInt(prompt("Vvedite 3: "));

if (a + b > c && a + c > b && c + b > a) {
    alert("YES");
} else {
    alert("NO");
}
