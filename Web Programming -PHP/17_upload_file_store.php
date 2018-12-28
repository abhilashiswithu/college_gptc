<?php
session_start();
?>
<?php
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
							echo " ".$n;
							echo "Type :".$_FILES["file"]["type"]."<br/>";
							echo "Size :".$_FILES["file"]["size"]." bytes<br/>";
							echo "Temp File :".$_FILES["file"]["tmp_name"]."<br/>";
							move_uploaded_file($_FILES["file"]["tmp_name"],"upload/".$_FILES["file"]["name"]);
							echo "Stored in :"."upload/".$_FILES["file"]["name"]."<br/>";
							$f="upload/".$_FILES["file"]["name"];
							$q="insert into register(name,age,dob,gender,address,designation,doj,photo) values('$n','$age','$dob','$r','$add','$desig','$doj','$f')";
							mysql_query($q);
						}
					}
					else
					{
						echo"Invalid File";
					}
?>
<?php
session_destroy();
?>

