echo "Sum of Two numbers"
echo "Enter the 1st no."
read a
echo "Enter the 2nd no."
read b
c=$(expr $a \+ $b)
echo "Sum of $a and $b is : $c"
