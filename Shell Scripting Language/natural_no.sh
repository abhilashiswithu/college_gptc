echo "
Enter the limit to display the 1st n natural no.s"
read num
a=1
echo ""
while(test $a -le $num) do
echo "$a"
a=$(expr $a \+ 1)
done
