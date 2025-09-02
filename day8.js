<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <script>
        let currenttime=new Date();
console.log(currenttime);
let local=currenttime.toString();
console.log(local);
let hours=currenttime.getHours();
console.log(hours);
let minutes=currenttime.getMinutes();
console.log(minutes);
let day=currenttime.getDay();
console.log(day);
class Exam{
    constructor(personname){
    this.personname=personname;
    console.log(personname);
    }
}
let result=new Exam("dheekshi");
class Bank{
    constructor(initialamount=0){
        this._balance=initialamount;
    }
    get balance(){
        return this._balance;
    }
    set balance(amountdeposite){
        if(amountdeposite>0){
            this.balance+=amountdeposite;
            console.log(_balance);
        }
    }
}
let add=new Bank(10);
console.log(add);
add._balance=300;
console.log(add);
console.log(add.balance);
    </script>
</body>
</html>
