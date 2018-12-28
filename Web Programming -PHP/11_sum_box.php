<html>
	<head><title>sum</title></head>
	<body bgcolor="aqua">
		<form method="post">
			<center>
			<h1>Sum of to Numbers</h1><hr><br/>
			Number 1 :<input type="text" name="n1" required><br/> 
			Number 2 :<input type="text" name="n2"required><br/>
			<input type="submit" name="s" value="SUBMIT"><br/>
			<?php
				if(isset($_POST['s']))
				{
					$num1=$_POST['n1'];
					$num2=$_POST['n2'];
					function sum($n1,$n2)
					{
						$s=$n1+$n2;
						echo "<br/>The SUM of ".$n1." and ".$n2." is : ".$s;
					}
					sum($num1,$num2);
				}
			?>
			</center>
		</form>
	</body>
</html>
