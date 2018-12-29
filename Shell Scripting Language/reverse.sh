echo "
Enter the number to display its reverse"
read num
n=$num
s=0
a=0
while(test $num -gt 0)
do
a=$(expr $num \% 10)
s=$(expr $s \* 10 \+ $a)
num=$(expr $num \/ 10)
done
echo "
Reverse of $n is : $s"
