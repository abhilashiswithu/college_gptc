echo "
Electricity Bill
****************"
echo "Enter the name."
read nam
echo "Enter the consumer no."
read no
echo "Enter the previous reading."
read r1
echo "Enter the current reading."
read r2
unit=$(expr $r2 \- $r1)
u1=$(expr $unit \- 100)
u2=$(expr $unit \- 250)
if(test $unit -le 100) then
rs=$(expr $unit \* 1)
else if(test $unit -le 250) then
rs1=$(expr 100 \* 1)
rs2=$(expr $u1 \* 2)
rs=$(expr $rs1 \+ $rs2)
else if(test $unit -gt 250) then
rs1=$(expr 100 \* 1)
rs2=$(expr 150 \* 2)
rs3=$(expr $u2 \* 5)
rs=$(expr $rs1 \+ $rs2 \+ $rs3)
fi fi fi	
echo "
******************************"
echo "Name            : $nam"
echo "Consumer No     : $no"
echo "Current Reading : $r2"
echo "Previous Reading : $r1"
echo "*******************************"
echo "Unit consumed   : $unit"
echo "Price           : $rs"
echo "*******************************
"
