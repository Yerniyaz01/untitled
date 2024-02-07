let a = Number.parseInt(prompt("Vvedite tenge: "));

let b = a / 380;

let c = Number.parseInt((b*100) % 100);
let d = Number.parseInt(b);

if (a%380===0) {
    alert("ONLY " + b + " USD");
} else {
    alert(d + " USD " + c + " cent")
}
