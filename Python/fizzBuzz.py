out = ""
for i in range(1, 101):
    if i % 15 == 0:
        out += "FizzBuzz "
    elif i % 3 == 0:
        out += "Fizz "
    elif i % 5 == 0:
        out += "Buzz "
    else:
        out += str(i) + " "
print(out)