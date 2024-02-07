
let books = [
    {name: 'Harry Potter and the Philosophers Stone', author:'Joanne Rowling', ISBN: 1233123, price: 50},
    {name: 'Harry Potter and the Chamber of Secrets', author:'Joanne Rowling', ISBN: 222332, price: 40},
    {name: 'Harry Potter and the Prisoner of Azkaban', author:'Joanne Rowling', ISBN: 452323, price: 55},
    {name: 'Martin Eden', author:'Jack London', ISBN: 6684833, price: 78},
    {name: 'The Call of the Wild', author:'Jack London', ISBN: 5857893, price: 65},
    {name: 'Hearts of Three', author:'Jack London', ISBN: 7598973, price: 47},
    {name: 'Atlas Shrugged', author:'Ayn Rand', ISBN: 74764767, price: 200},
    {name: 'The Fountainhead', author:'Ayn Rand', ISBN: 6657474, price: 120},
    {name: 'The Little Prince', author:'Antuan de sent Exupery', ISBN: 858844, price: 35},
    {name: 'The Alchimist', author:'Paulo Coel', ISBN: 858589, price: 59},
]

let search = prompt("Введите автора:")

let bookSearch = [];
for (let i = 0; i < books.length; i++) {
    if (books[i]["author"] === search) {
        bookSearch.push(books[i].name + " - " + books[i].author + " - "
            + books[i].ISBN + " - " + books[i].price + " $ \n");
    }
}
alert(bookSearch)

