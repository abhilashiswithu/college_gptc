echo "Largest among 3 numbers"
echo "Enter the 1st no."
read a
echo "Enter the 2nd no."
read b
echo "Enter the 3rd no."
read c
if(test  $a -gt $b -a $a -gt $c ) then
echo "Largest no. is : $a"
else if(test $b -gt $c) then
echo "Largest no. is : $b"
else
echo "Largest no. is : $c"
fi fi
