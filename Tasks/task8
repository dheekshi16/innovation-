class User {
    #name; #email;

    constructor(name, email) {
        this.#name = name;
        this.#email = email;
    }
    get name() { return this.#name; }
    get email() { return this.#email; }
    set name(n) { this.#name = n; }
    set email(e) { 
        if (User.validateEmail(e)) this.#email = e; 
        else console.log("Invalid email!"); 
    }
    static validateEmail(email) {
        return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
    }
}
User.prototype.logActivity = function(act) {
    console.log(`${this.#name} did: ${act}`);
};
let u1 = new User("Alice", "alice@example.com");
let u2 = new User("Bob", "bob@domain.com");

console.log(u1.name, u1.email);
u2.email = "wrong-email";
u2.email = "bob@domain.com";

u1.logActivity("Logged in");
u2.logActivity("Updated profile");

console.log(User.validateEmail("test@domain.com"));
