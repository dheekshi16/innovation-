
let products = [
    { id: 1, name: "Laptop", price: 50000, quantity: 2 },
    { id: 2, name: "Phone", price: 20000, quantity: 0 },
    { id: 3, name: "Headphones", price: 1500, quantity: 5 },
    { id: 4, name: "Keyboard", price: 800, quantity: 3 };
let availableProducts = products.filter(p => p.quantity > 0);
console.log("Available Products:", availableProducts);
let totalCartValue = availableProducts.reduce((total, p) => total + p.price * p.quantity, 0);
console.log("Total Cart Value: ₹" + totalCartValue);
let removedProduct = products.splice(1, 1);
console.log("Removed Product:", removedProduct);
let clonedProducts = products.slice();
console.log("Cloned Products:", clonedProducts);
let newProduct = { id: 5, name: "Mouse", price: 500, quantity: 10 };
let updatedProducts = [...products, newProduct];
console.log("Updated Products List:", updatedProducts);
let productObj = {
    id: 6,
    name: "Monitor",
    price: 10000,
    quantity: 2,
    printDetails: function() {
        console.log(`Product ID: ${this.id}, Name: ${this.name}, Price: ₹${this.price}, Quantity: ${this.quantity}`);
    }
};
productObj.printDetails();
let { id, name, price, quantity } = updatedProducts[0];
console.log(`Destructured Product -> ID: ${id}, Name: ${name}, Price: ₹${price}, Quantity: ${quantity}`);
