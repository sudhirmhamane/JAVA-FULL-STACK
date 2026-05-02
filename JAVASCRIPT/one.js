/*
console.log("Hello Hello");

// datatypes in JS:

// 1. Number

var a = 10;
console.log(a);
console.log(typeof a);

// Hello Hello
// 10
// number

let a1 = 10.454;
console.log(a1);
console.log(typeof a1);

// 2. boolean

let b = true;
let c = false;

console.log(b); // ture
console.log(typeof b); // boolean
console.log(c); // false
console.log(typeof c); // boolean

// 3. Undefined

let d;
console.log(d);
console.log(typeof d);
d = 10;
console.log(d);
console.log(typeof d);

// 4. null

let e = null;
console.log(e);
console.log(typeof e);

// 5. String

let f = "Hello JS";
console.log(f);
console.log(typeof f);

let f1 = "Hello JS";
console.log(f1);
console.log(typeof f1);

let f2 = `Hello JS`;
console.log(f2);
console.log(typeof f2);

// 6. bigInt

let g = 123345298437489742938779n;
console.log(g);
console.log(typeof g);

// 7. symbol

let h = Symbol("Hello");
console.log(h);
console.log(typeof h);
*/

// Conditional Statements:

// let a = 1000;
// let b = "1000";

// console.log(a == b);
// // o/p -> true

// console.log(a === b);
// // o/p -> false

// if (a === b) {
//   console.log("YES");
// } else if (a == b) {
//   console.log("Yes, but just value is eauals not datatype");
// } else {
//   console.log("Not equals");
// }

// alert("logging success"); // alert message to use

// let a = confirm("Are you Sure"); // it is take confirmation
// console.log(a)

// let b = prompt("Enter a number"); // take input from user
// console.log(b);


// functions -> function is block of code which is used to do specific task.

function add(){
    console.log("Executed!")
}


function alertMessage(){
    alert("Invalide User");
}

function userInput(){
   let c = prompt("Enter a value: ");
   let d = Number(c);
   console.log(c);
   console.log(d)
   console.log(typeof c)
}

// after clicking 

function evenOdd(){
    let a = Number(prompt("Enter a number"));

    if(a%2 === 0){
        console.log("Number is even")
    } else {
        console.log("number is odd")
    }
}

function addOfTwo(){
    let a = Number(prompt("Enter 1st num: "));
    let b = Number(prompt("Enter 2st num: "));

    let c = a + b;
    console.log(c);
}

function userCheck(){
    let a = Number(prompt("Enter username: "))
    let b = Number(prompt("Enter password: "))

    if(a !=="" && b !==""){
        console.log("login successfull")
    }else{
        console.log("Enter valid Creadential!")
    }
}

