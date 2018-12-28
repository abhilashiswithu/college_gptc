<?php
session_start();
?>
<html>
	<head>
		<title>bank</title>
	</head>
	<body bgcolor="#1973E0">
		<center>
			<h1>SBI</h1><br/><hr><br/>
			<form method="post">
				Account No. :
				<input type="text" name="no"><br/><br/>
				<input type="submit" value="SUBMIT" name="s"><br/><br/><hr><br/><br/>
				<?php
					if(isset($_POST['s']))
					{
						$n=$_POST['no'];
						$_SESSION["name"]=$n;
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from bank");
		                $q2=mysql_fetch_array($q1);
						if($n==$q2["ac_no"])
						{
							header('Location:bank_explode2.php');
						}
						else
						{
							echo "<br/>SORRY!!! Invalid Register No.<hr>";
						}
					}
				?>
			</form>
		</center>
	</body>
</html>
