echo "
Enter the number to find its factorial"
read num
a=1
n=1
echo ""
while(test $n -le $num ) do
a=$(expr $a \* $n)
n=$(expr $n \+ 1)
done
echo "Factorial of $num is : $a"
