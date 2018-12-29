echo "
********-MENU-********
"
echo "1.Addition"
echo "2.Subtraction"
echo "3.Multiplication"
echo "4.Division
"
read num
echo "
Enter the 2 no."
read n1
read n2

case $num in
1) 
a=$(expr $n1 \+ $n2)
echo "Sum of $n1 and $n2 is : $a"
;;
2) 
b=$(expr $n1 \- $n2)
echo "Difference between $n1 and $n2 is : $b"
;;
3) 
c=$(expr $n1 \* $n2)
echo "Product of $n1 and $n2 is : $c"
;;
4) 
d=$(expr $n1 \/ $n2)
echo "Quoitent of $n1 and $n2 is : $d"
;;
*) 
echo "Invalid option"
;;
esac
