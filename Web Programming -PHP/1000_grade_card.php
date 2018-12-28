<?php
session_start();
?>
<html>
	<head>
		<title>mrklist</title>
	</head>
	<body bgcolor="#24A1DF">
		<center>
			<h1>GRADE CARD</h1><br/><hr><br/>
			<form method="post">
				Enter the Register No. :
				<input type="text" name="no"><br/><br/>
				<input type="submit" value="SUBMIT" name="s"><br/><br/><hr><br/><br/>
				<?php
					if(isset($_POST['s']))
					{
						$n=$_POST['no'];
						$_SESSION["name"]=$n;
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from mark_list where reg='$n'");
		                $q2=mysql_fetch_array($q1);
						if($n==$q2["reg"])
						{
							header('Location:15_mark_list.php');
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
