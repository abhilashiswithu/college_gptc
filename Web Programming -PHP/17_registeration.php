<html>
	<head>
	<title>register</title>
	</head>
	<body bgcolor="#1D7FF2">
		<form method="post"  enctype="multipart/form-data">
			<center>
				<h1>REGISTRATION FORM</h1><hr><br/>
				<table border="0" height=400px;>
					<tr>
						<th>Employee Name :</th>
						<td><input type="text" name="n" required></td>
					</tr>
					<tr>
						<th>Age :</th>
						<td><input type="text" name="age"required></td>
					</tr>
					<tr>
						<th>Date of Birth :</th>
						<td><input type="text" name="dob"required placeholder="YYYY-MM-DD"></td>
					</tr>
					<tr>
						<th>Gender :</th>
						<td>Male <input type="radio" name="r" value="Male"required>
							&nbsp;Female <input type="radio" name="r" value="Female"required></td>
					</tr>
					<tr>
						<th>Address :</th>
						<td><textarea name="add"required></textarea></td>
					</tr>
					<tr>
						<th>Designation :</th>
						<td><input type="text" name="desig"required></td>
					</tr>
					<tr>
						<th>Date of Join :</th>
						<td><input type="text" name="doj"required placeholder="YYYY-MM-DD"></td>
					</tr>
					<tr>
						<th>Photo :</th>
						<td><input type="file" name="file" id="file"></td>
					</tr>
					<tr>
						<td><input type="reset" name="r" value="RESET"></td>
						<td><input type="submit" name="s" value="SUBMIT"></td>
					</tr>
				</table>


				<?php
				if(isset($_POST['s']))
				{
					$n=$_POST['n'];
					$age=$_POST['age'];
					$dob=$_POST['dob'];
					$r=$_POST['r'];
					$add=$_POST['add'];
					$desig=$_POST['desig'];
					$doj=$_POST['doj'];

					if((($_FILES["file"]["type"]=="image/gif")||($_FILES["file"]["type"]=="image/jpeg")||($_FILES["file"]["type"]=="image/pjpeg"))&&($_FILES["file"]["size"]<2000000))
					{
						if(($_FILES["file"]["error"]>0))
						{
							echo "Return Code :".$_FILES["file"]["error"]."<br/>";
						}
						else
						{
							mysql_connect("localhost", "root", "root");
							mysql_select_db("abhilash");
							echo "<br/>Upload :".$_FILES["file"]["name"]."<br/>";
							echo "Type :".$_FILES["file"]["type"]."<br/>";
							echo "Size :".$_FILES["file"]["size"]." bytes<br/>";
							echo "Temp File :".$_FILES["file"]["tmp_name"]."<br/>";
							move_uploaded_file($_FILES["file"]["tmp_name"],"upload/".$_FILES["file"]["name"]);
							echo "Stored in : upload/".$_FILES["file"]["name"]."<br/>";
							$f="upload/".$_FILES["file"]["name"];
							$q="insert into register(name,age,dob,gender,address,designation,doj,photo) values('$n','$age','$dob','$r','$add','$desig','$doj','$f')";
							mysql_query($q);
						}
					}
					else
					{
						echo"Invalid File";
					}
				}
				?>
			</center>
		</form>
	</body>
</html>
