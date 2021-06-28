fun main() {
    out = "";
    for (i in 1..100)
        out += when {
            i % 15 == 0 -> "FizzBuzz "
            i % 3 == 0 -> "Fizz "
            i % 5 == 0 -> " Buzz "
            else -> "$i "
        }
    print(out)    
}