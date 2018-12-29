echo "
Student Details
***************"
echo "Enter the name."
read nam
echo "Enter the dob."
read dob
echo "Enter the class."
read cl
echo "Enter the branch."
read br
echo "Enter the mark (out of 100) of subject1."
read m1
echo "Enter the mark (out of 100) of subject2."
read m2
echo "Enter the mark (out of 100) of subject3."
read m3
tot=$(expr $m1 \+ $m2 \+ $m3)
per=$(expr $tot \* 100 \/ 300)

if(test $per -ge 90) then
g="A"
else if(test $per -ge 80 -a $per -lt 90) then
g="B"
else if(test $per -ge 70 -a $per -lt 80) then
g="C"
else if(test $per -ge 60 -a $per -lt 70) then
g="D"
else if(test $per -ge 50 -a $per -lt 60) then
g="E"
else
g="F"
fi fi fi fi fi

echo "
******************************"
echo "Name       : $nam"
echo "DOB        : $dob"
echo "Class      : $cl"
echo "Branch     : $br"
echo "*******************************"
echo "Total Mark : $tot"
echo "Grade      : $g"
echo "*******************************
"
