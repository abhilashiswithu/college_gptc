echo "
Calculate HRA, DA, PF of salary
*******************************
"
echo "Enter the Basic Salary."
read bs
echo "
*************"
echo "1.HRA"
echo "2.DA"
echo "3.PF"
echo "*************
"
read num

case $num in
1) 
hra=$(expr 20 \* $bs \/ 100)
echo "
HRA = $hra"
;;
2) 
da=$(expr 40 \* $bs \/ 100)
echo "
DA = $da"
;;
3) 
pf=$(expr 10 \* $bs \/ 100)
echo "
PF = $pf"
;;
*) 
echo "Invalid option"
;;
esac
