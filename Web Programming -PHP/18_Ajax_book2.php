<?php
	$q=$_GET["q"];

	
	mysql_connect("localhost", "root", "root");
	mysql_select_db("abhilash");
	$query="SELECT * FROM book WHERE id = '".$q."'";
	$result = mysql_query($query);
	?>
	<style>
		table{width: 500px; height: 75px; background-color: #99ccff;}
	</style>
	<?php
	echo "<table border='1'>

		<tr>
		<th>Book Name</th>
		<th>Author</th>
		<th>Category</th>
		<th>Price</th>
		<th>Year</th>
		</tr>";

	while($row = mysql_fetch_array($result))
	{
		echo "<tr>
				<td>" . $row['name'] . "</td>
				<td>" . $row['Author'] . "</td>
				<td>" . $row['Category'] . "</td>
				<td>" . $row['Price'] . "</td>
				<td>" . $row['Year'] . "</td>
			</tr>";
	}
	echo "</table>";
?>
