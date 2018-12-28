
<?php
	$q=$_GET["q"];
	$con=mysql_connect('localhost','root','root')
	if(!$con)
	{
		die('Not able to connect :'.mysql_error());
	}
	mysql_select_db("employees",$con);
	$query="SELECT * FROM emprecord WHERE id=".$q."";
	$result= mysql_quer($query);
	echo "<table border='1'>
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>City</th>
		<th>Designation</th>
	</tr>";
	while($row= mysql_fetch_array($result))
	{
		echo "<tr>";
		echo "<td>".$row['name']."</td>";
		echo "<td>".$row['Age']."</td>";
		echo "<td>".$row['City']."</td>";
		echo "<td>".$row['Designation']."</td>";
		echo "</tr>";
	}
	echo "</table>";
	mysql_close($con);
?>
