
let mas = [{name: "", surname: "", gpa: null}];
let a = 0;
let b = 0;


mas.pop();

a = prompt("PRESS 1 TO ADD STUDENT\n" + "PRESS 2 TO LIST STUDENT\n" + "PRESS 0 TO EXIT");
while (a != 0) {
    if (a == 1) {
        let name = prompt("INSERT NAME:");
        let surname = prompt("INSERT SURNAME:");
        let gpa = prompt("INSERT GPA:")*1;
        mas[b] = {name: name, surname: surname, gpa: gpa};
        b++;
    }
    if (a == 2) {
        let getInfo = [];
        for (let i = 0; i < mas.length; i++) {
            getInfo.push("Name: " + mas[i].name + ", Surname: " + mas[i].surname + ", GPA: " + mas[i].gpa + "\n");
        }
        alert(getInfo);
    }

    a = prompt("PRESS 1 TO ADD STUDENT\n" + "PRESS 2 TO LIST STUDENT\n" + "PRESS 0 TO EXIT");
}
