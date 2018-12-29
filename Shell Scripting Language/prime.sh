echo "Enter the no. to check whether the no. is prime or not"
read a
i=1
c=0
while (test $i -le $a) do
if(test $(expr $a \% $i) -eq 0)then
c=$(expr $c \+ 1)
fi
i=$(expr $i \+ 1)
done
if(test $c -eq 2)then
echo "$a is a prime no."
else
echo "$a is not a prime no."
fi
