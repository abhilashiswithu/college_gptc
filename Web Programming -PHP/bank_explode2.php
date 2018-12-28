<?php
session_start();
?>
<html>
	<head>
		<title>marklist</title>
	<style>
		#t{margin: auto auto; background-color: #99ccff;}
		th,td{margin: auto auto;; }
	</style>
	</head>
	<body bgcolor="#24A1DF">
			<h1 align=center>SBI</h1><br/><hr><br/>
		</center>
				<?php
					{
						$n=$_SESSION["name"];
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from bank where ac_no='$n'");
		                $q2=mysql_fetch_array($q1);
						echo "<table border=0>";
						echo"<tr><th align=right>Account No. :<th/><td>".$q2["ac_no"]."</td></tr> ";
						echo"<tr><th align=right>Name :<th/><td>".$q2["name"]."</td></tr> ";
						echo "</table><br/><br/><hr><br/>";
						echo"<h3 align=center><u>Transactions<u></h3>"	;	
						$debit=$q2["debit"];
						$credit=$q2["credit"];
						
						echo "<table border=0 id=t>";
						echo"<tr><th>DEPOSIT<th/></tr>";
						foreach(explode(',',$credit) as $value)
							{
								
							echo"<tr><td>".$value."</td></tr> ";
							}
						echo "</table>";
						echo "<table border=0 id=t>";
						echo"<tr><th>WITHDRAWAL<th/></tr>";
						foreach(explode(',',$debit) as $value)
							{
								
							echo"<tr><td>".$value."</td></tr> ";
							}
						echo "</table>";
					}
				?>
			</form>
		</center>
	</body>
</html>
<?php
session_destroy();
?>
