<?php
session_start();
?>
<html>
	<head>
		<title>electricity</title>
		
	<style>
		#t{width: 300px; height: 250px; background-color: #99ccff;}
		table{width: 300px; height: 50px; background-color: #99ccff;}
	</style>
	</head>
	<body bgcolor="#24A1DF">
		<center>
			<h1>Kerala State Electricity Board</h1><br/><hr><br/>
				<?php
						$no=$_SESSION["no"];
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from electricity where c_no='$no'");
						$q2=mysql_fetch_array($q1);
						
						$cr=$q2['c_reading'];
						$pr=$q2['p_reading'];
						$unit=$cr-$pr;
						if($unit<=100) $amt=$unit*1.25;
						else if($unit<=250) $amt=(100*1.25)+(($unit-100)*2.5);
						else if($unit<=500) $amt=(100*1.25)+(150*2.5)+(($unit-250)*5);
						else if($unit<=1000) $amt=(100*1.25)+(150*2.5)+(250*5)+(($unit-500)*10);
						else $amt=(100*1.25)+(150*2.5)+(250*5)+(500*10)+(($unit-1000)*20);

						echo"<table border=0 id=t >";
							echo"<tr><th align=right>Consumer No. :</th>";
							echo"<td>".$q2['c_no']."</td></tr>";
							echo"<tr><th align=right>Name :</th>";
							echo"<td>".$q2['name']."</td></tr>";
							echo"<tr><th align=right>Section :</th>";
							echo"<td>".$q2['section']."</td></tr>";
							echo"<tr><th align=right>Current Reading :</th>";
							echo"<td>".$q2['c_reading']." units</td></tr>";
							echo"<tr><th align=right>Previous Reading :</th>";
							echo"<td>".$q2['p_reading']." units</td></tr>";
							echo"<tr><th align=right>Unit Consumed :</th>";
							echo"<td>".$unit." units</td></tr>";
						echo"</table><br/><br/>";
						echo"<table border=0>";
							echo"<tr><th align=right>Amount :</th>";
							echo"<td> Rs. :".$amt." /-</td></tr>";
						echo"</table>";
				?>
				<br/><br/><hr><br/><br/>
		</center>
	</body>
</html>
<?php
session_destroy();
?>
