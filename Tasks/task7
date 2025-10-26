
class Book {
    constructor(title, author, publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = new Date(publishedYear);
    }
    getSummary() {
        return `${this.title} by ${this.author}, published in ${this.publishedYear.getFullYear()}`;
    }
}
class EBook extends Book {
    constructor(title, author, publishedYear, fileSize) {
        super(title, author, publishedYear);
        this.fileSize = fileSize;
    }
    getSummary() {
        return `${super.getSummary()} - File Size: ${this.fileSize} MB`;
    }
}
let book1 = new Book("The Alchemist", "Paulo Coelho", "1988-05-01");
let book2 = new Book("1984", "George Orwell", "1949-06-08");

let ebook1 = new EBook("Digital Fortress", "Dan Brown", "1998-01-01", 2.5);
let ebook2 = new EBook("Eloquent JavaScript", "Marijn Haverbeke", "2018-12-04", 3);
console.log(book1.getSummary());
console.log(book2.getSummary());
console.log(ebook1.getSummary());
console.log(ebook2.getSummary());
