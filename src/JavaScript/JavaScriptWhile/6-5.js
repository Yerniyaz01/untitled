
let users = [
    {login:"ilyas", password: "qwerty"},
    {login:"eldar", password: "qqqqq"},
    {login:"assylkhan", password: "qweqwe"},
    {login:"anel", password: "asdasd"},
    {login:"alibek", password: "aaaaaa"}
];


let name = prompt("Vvedite name: ");
let pass = prompt("Vvedite password: ");

let check = false;

for (let i = 0; i < users.length; i++) {
    if (name === users[i]["login"]) {
        if (pass === users[i]["password"]){
            alert("Welcome, you are authenticated");
            check = false;
            break;
        }
    }
    check = true;
}
if (check === true) {
    alert("User not found");
}
