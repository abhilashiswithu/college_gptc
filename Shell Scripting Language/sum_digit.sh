echo "
Enter the number to display the sum of digits"
read num
n=$num
s=0
a=0
while(test $num -gt 0)
do
a=$(expr $num \% 10)
s=$(expr $s \+ $a)
num=$(expr $num \/ 10)
done
echo "
Sum of digits of $n is : $s"
