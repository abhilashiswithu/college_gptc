echo "Check the number is Even or Odd"
echo "Enter the no."
read a
if(test $(expr $a \% 2) -eq 0 ) then
echo "$a is a EVEN number"
else
echo "$a is a ODD number"
fi
