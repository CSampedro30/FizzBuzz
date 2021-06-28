out = ""

for (i = 1; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
        out += "FizzBuzz "
    }
    else if(i % 3 == 0) {
        out += "Fizz "
    }
    else if (i % 5 == 0) {
        out += "Buzz "
    }
    else {
        out += i + " "
    }
}

console.log(out)