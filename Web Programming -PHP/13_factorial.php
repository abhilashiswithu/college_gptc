<html>
	<head><title>fact</title></head>
	<body bgcolor="aqua">
		<form method="post">
			<center>
			<h1>Factorial of a Number</h1><hr><br/>
			Enter the number :<input type="text" name="n"><br/> 
			<input type="submit" name="s" value="SUBMIT"><br/>
			<?php
				if(isset($_POST['s']))
				{
					$num=$_POST['n'];
					function fact($n)
					{	
						if($n==NULL)
						{
							echo"Please enter the number";
						}
						else if($n==0)
						{
							echo"<br/>The Factorial of ".$n." is : 0";
						}
						else
						{
							echo"<br/>The Factorial of ".$n." is : ";
							$f=1;
							for($i=1;$i<=$n;$i++)
							{
								$f=$f*$i;
							}
							echo $f;
						}
					}
					fact($num);
				}
			?>
			</center>
		</form>
	</body>
</html>
