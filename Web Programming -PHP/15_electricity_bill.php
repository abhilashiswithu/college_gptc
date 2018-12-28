<?php
session_start();
?>
<html>
	<head>
		<title>electricity</title>
		
	<style>
		table{width: 450px; height: 300px; background-color: #99ccff;}
	</style>
	</head>
	<body bgcolor="#24A1DF">
		<center>
			<h1>Kerala State Electricity Board</h1><br/><hr><br/>
			<form method="post">
				<table border="0">
					<tr>
						<th align="right">Consumer No. :</th>
						<td><input type="text" name="no"required></td>
					</tr>
					<tr>
						<th align="right">Name :</th>
						<td><input type="text" name="nam" required></td>
					</tr>
					<tr>
						<th align="right">Section :</th>
						<td><input type="text" name="sec" required></td>
					</tr>
					<tr>
						<th align="right">Current Reading :</th>
						<td><input type="text" name="cr" required></td>
					</tr>
					<tr>
						<th align="right">Previous Reading :</th>
						<td><input type="text" name="pr" required></td>
					</tr>
					<tr>
						<td align="right"><input type="reset" value="RESET" name="r"></td>
						<td align="right"><input type="submit" value="SUBMIT" name="s"></td>
					</tr>
				</table>
				<br/><br/><hr><br/><br/>
				<?php
					if(isset($_POST['s']))
					{
						$no=$_POST['no'];
						$nam=$_POST['nam'];
						$sec=$_POST['sec'];
						$cr=$_POST['cr'];
						$pr=$_POST['pr'];
						$_SESSION["no"]=$no;
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("insert into electricity values('$no','$nam','$sec','$cr',$pr)");
						if($q1)
						{
							header('Location:15_bill.php');
						}
					}
				?>
			</form>
		</center>
	</body>
</html>
