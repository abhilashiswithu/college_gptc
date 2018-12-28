<html>
	<head>
	<title>vaild</title>
	</head>
	<body bgcolor="#1D7FF2">
		<form method="post">
			<center>
				<h1>LOGIN FORM</h1><hr><br/>
				<table border="0">
					<tr>
						<th>Username :</th>
						<td><input type="text" name="n" required></td>
					</tr>
					<tr>
						<th>Password :</th>
						<td><input type="password" name="p"required></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="submit" name="s" value="LOGIN"></td>
					</tr>
				</table>
				<?php
				if(isset($_POST['s']))
				{
					$n=$_POST['n'];
					$p=$_POST['p'];
                    mysql_connect("localhost", "root", "root");
                    mysql_select_db("abhilash");
                    $re=mysql_query("select regid from login where username='$n' and password='$p'");
                    $re1=  mysql_fetch_array($re);
				    $n1=mysql_query("select username from login where username='$n'");
				    $n2=  mysql_fetch_array($n1);
				    $p1=mysql_query("select password from login where password='$p'");
				    $p2=  mysql_fetch_array($p1);
                    if($re1["regid"]>0)
                    {
						echo "<br/><br/>Welcome ".$n2["username"]." to the world of programming" ;
                    }
					else if($n2["username"]==$n && $p2["password"]!=$p)
					{
						echo "<br/><br/>Please enter the correct password";
					}
                    else if($n2["username"]!=$n && $p2["password"]!=$p)
                    {
                         echo "<br/><br/>SORRY PLEASE CREATE AN ACCOUNT";   
                    }
				}
				?>
			</center>
		</form>
	</body>
</html>
