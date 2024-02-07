let a = Number.parseInt(prompt("Vvedite year: "));

if (a < 30000) {
    if (a % 400 !== 0) {
        if (a % 4 === 0 && a % 100 !== 0) {
            alert("YES");
        } else {
            alert("NO");
        }
    }
    if (a % 400 === 0) {
        alert("YES");
    }
} else {
    alert("ERROR");
}


