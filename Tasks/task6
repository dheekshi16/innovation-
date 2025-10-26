
let contacts = [
  { name: "Alice", phone: "1234567890", email: "alice@example.com", display() { let {name, phone, email} = this; console.log(`${name}, ${phone}, ${email}`); } },
  { name: "Bob", phone: "9876543210", email: "bob@example.com", display() { let {name, phone, email} = this; console.log(`${name}, ${phone}, ${email}`); } }
];
console.log(contacts[0].name, contacts[1]["email"]);
contacts.forEach(c => c.display()
const addContacts = (...newContacts) => contacts.push(...newContacts);
addContacts(
  { name:"Charlie", phone:"5555555555", email:"charlie@example.com", display: contacts[0].display },
  { name:"Diana", phone:"6666666666", email:"diana@example.com", display: contacts[0].display }
);
contacts = [...contacts, { name:"Eve", phone:"7777777777", email:"eve@example.com", display: contacts[0].display }];
let temp = { name:"Frank", phone:"8888888888", email:"frank@example.com" };
contacts[0].display.call(temp);
contacts[0].display.apply(temp);
let bound = contacts[0].display.bind(temp); bound();
console.log("\nAll Contacts:");
contacts.forEach(c => c.display());
