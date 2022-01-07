<?php
$out = '';
for ($i=1; $i <= 100; $i++) { 
    if ($i % 15 == 0) {
        $out .= 'FizzBuzz ';
    }
    elseif ($i % 3 == 0) {
        $out .= 'Fizz ';
    }
    elseif ($i % 5 == 0) {
        $out .= 'Buzz ';
    } else {
        $out .= $i . ' ';
    }
}
echo $out;