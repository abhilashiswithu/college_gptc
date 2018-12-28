<?php
	$li=20;
	function prime($n)
	{
		for($num=2;$num<=$n;$num++)
		{
			$c=0;
			for($i=1;$i<=$num;$i++)
			{
				if($num%$i==0)
				{
					$c=$c+1;
				}
				
			}
			if($c==2)
			{
				echo " ".$num.", ";
			}
		}
	}
	echo "The prime no. between 1 to ".$li." are : ";
	prime($li);
?>
