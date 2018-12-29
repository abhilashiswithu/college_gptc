echo "Enter limit to print the prime no.s"
read num
a=2
i=1
c=0
while (test $a -le $num ) do
	while (test $i -le $a) do
		if(test $(expr $a \% $i) -eq 0)then
			c=$(expr $c \+ 1)
		fi
	i=$(expr $i \+ 1)
	done
	if(test $c -eq 2)then
		echo "$a"
	fi
	a=$(expr $a \+ 1)
done
