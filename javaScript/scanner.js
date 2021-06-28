length = process.argv[2]
flagOne = process.argv[3]
flagTwo = process.argv[4]

out = ""

for (i = 1; i <= length; i++) {
    if (i % flagOne == 0 && i % flagTwo == 0) {
        out += "FizzBuzz "
    }
    else if(i % flagOne == 0) {
        out += "Fizz "
    }
    else if (i % flagTwo == 0) {
        out += "Buzz "
    }
    else {
        out += i + " "
    }
}

console.log(out)