echo "
Enter the number to check whether the no. is armstrong or not"
read num
n=$num
s=0
a=0
c=1
c1=$(expr length $num)
while(test $num -gt 0)
do
a=$(expr $num \% 10)
s=$(expr $s \+ $a \* $a \* $a)
num=$(expr $num \/ 10)
if(test $c -eq $c1 ) then
	if(test $s -eq $n ) then
	echo "$n is an Armstrong no."
	else
	echo "$n is not an Armstrong no."
	fi
fi
c=$(expr $c \+ 1)
done 
