let a = Number.parseInt(prompt("Choose your branch:\n" + "1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:"));

if (a === 1) {
    let b = Number.parseInt(prompt("1 - Math, 2 - Physics:"));
    if (b === 1) {
        alert("You are Financier");
    }
    if (b === 2) {
        alert("You are Engineer");
    }
}
if (a === 2) {
    let b = Number.parseInt(prompt("1 - History, 2 - Foreign Languages:"));
    if (b === 1) {
        alert("You are Historic or Diplomat");
    }
    if (b === 2) {
        alert("You are Translator");
    }
}
if (a === 3) {
    let b = Number.parseInt(prompt("1 - Drawing, 2 -Singing:"));
    if (b === 1) {
        alert("You are Painter or Architect");
    }
    if (b === 2) {
        alert("You are Singer or Tamada");
    }
}
if (a === 4) {
    let b = Number.parseInt(prompt("1 - Team, 2 - Individual:"));
    if (b === 1) {
        alert("You are footballer or Basketball player");
    }
    if (b === 2) {
        alert("You are boxer or tennis player");
    }
}


