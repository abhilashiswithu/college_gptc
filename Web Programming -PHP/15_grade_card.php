<html>
	<head>
		<title>gradecard</title>
	</head>
	<body bgcolor="#24A1DF">
		<center>
			<h1>GRADE CARD</h1><br/><hr><br/>
			<form method="post">
				Enter the Register No. :
				<input type="text" name="no"><br/><br/>
				<input type="submit" value="SUBMIT" name="s"><br/><br/><hr><br/><br/>
		</center>
				<?php
					if(isset($_POST['s']))
					{
						$n=$_POST['no'];
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from grade where reg='$n'");
		                $q2=mysql_fetch_array($q1);
						echo "<table border=0>";
						echo"<tr><th align=right>Register No. :<th/><td>".$q2["reg"]."</td></tr> ";
						echo"<tr><th align=right>Name :<th/><td>".$q2["name"]."</td></tr> ";
						echo"<tr><th align=right>Semester :<th/><td>".$q2["semester"]."</td></tr> ";
						echo "</table><br/><br/><hr><br/>";
		                $q3=mysql_query("select * from r14260002");
						while ($q4=mysql_fetch_array($q3))
						{
							echo $q4["credit"]."<br/>";
						}
					}
				?>
			</form>
	</body>
</html>
