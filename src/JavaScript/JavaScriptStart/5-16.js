let a = Number.parseInt(prompt("Vvedite MINUTES:"));

let b = a / 60;

let c = Number.parseInt(a % 60);
let d = Number.parseInt(b);

if (a % 60 === 0) {
    alert("ONLY " + b + " HOURS");
} else {
    alert(d + " HOURS " + c + " MINUTES")
}

// 9 HOURS and 26 MINUTES
