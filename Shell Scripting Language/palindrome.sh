echo "
Enter the number to check whether the no. is palindrome or not"
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
if(test $s -eq $n ) then
echo "$n is a palindrome no."
else
echo "$n is not a palindrome no."
fi
