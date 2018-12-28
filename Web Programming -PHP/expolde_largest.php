<html>
	<head>
		<title>electricity</title>
		
	</head>
	<body bgcolor="#24A1DF">
<form method="post">
number :
					<input type="text" name="no"required>
<input type="submit" value="SUBMIT" name="s">

				<?php
					$b=0;
					if(isset($_POST['s']))
					{
						$nums=$_POST['no'];
foreach(explode(',',$nums) as $value)
	{
		$a=$value;
		if($a>$b)
		{
			$b=$a;
		}
	}
	echo"Largest No. is ".$b;
}
?>
</form>
</body>
</html>
