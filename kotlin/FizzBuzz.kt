fun main() {
   for (i in 1..100)
       when {
           i % 15 == 0 -> {
               print(" FizzBuzz ")
           }
           i % 3 == 0 -> {
               print(" Fizz ")
           }
           i % 5 == 0 -> {
               print(" Buzz ")
           }
           else -> {print(" $i ")}
       }
}

