<?php
	$a=array(array(1,2,3),array(1,2,3),array(1,2,3));
	$b=array(array(1,2,3),array(1,2,3),array(1,2,3));
	echo"Matrix A is :<br/>";
	display($a);
	echo"Matrix B is :<br/>";
	display($b);
	function display($m)
	{
		for($i=0;$i<count($m);$i++)
		{
			for($j=0;$j<count($m);$j++)
			{
				echo " ".$m[$i][$j]." ";
			}
			echo"<br/>";
		}
	}
	echo"Sum of 2 matrices is:<br/>";
	add($a,$b);
	function add($m1,$m2)
	{
		for($i=0;$i<count($m1);$i++)
		{
			for($j=0;$j<count($m1);$j++)
			{
				$s[$i][$j]=$m1[$i][$j]+$m2[$i][$j];
			}
		}
		display($s);
	}
	
?>
