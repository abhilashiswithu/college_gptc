echo "
Enter the limit to display the fibonacci series"
read num
a=0
b=0
c=1
echo "
Fibonacci series up to $num is:
$b"
while(test $c -le $num) do
echo "$c"
a=$b
b=$c
c=$(expr $a \+ $b)
done
