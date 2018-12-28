<?php
	$num=343;
	function sum($n)
	{
		$s=0;
		while($n>0)
		{
			$r=$n%10;
			$s=$s+$r;
			$n=$n/10;
		}
		echo $s;
	}
	echo"The sum of digits of ".$num." is : ";
	sum($num);
?>
