<?php
session_start();
?>
<html>
	<head>
		<title>marklist</title>
	<style>
		#t{width: 600px; height: 160px; margin: auto auto; background-color: #99ccff;}
		th,td{margin: auto auto;; }
	</style>
	</head>
	<body bgcolor="#24A1DF">
			<h1 align=center>MARK LIST</h1><br/><hr><br/>
		</center>
				<?php
					{
						$n=$_SESSION["name"];
		                mysql_connect("localhost", "root", "root");
		                mysql_select_db("abhilash");
		                $q1=mysql_query("select * from mark_list where reg='$n'");
		                $q2=mysql_fetch_array($q1);
						echo "<table border=0>";
						echo"<tr><th align=right>Register No. :<th/><td>".$q2["reg"]."</td></tr> ";
						echo"<tr><th align=right>Name :<th/><td>".$q2["name"]."</td></tr> ";
						echo"<tr><th align=right>Semester :<th/><td>".$q2["semester"]."</td></tr> ";
						echo "</table><br/><br/><hr><br/>";
						$stud=array("DBMS"=>$q2['dbms'],"OS"=>$q2['os'],"DS"=>$q2['ds'],"WB"=>$q2['wb'],"Life SKill"=>$q2['life'],"DBMS LAB"=>$q2['dbms_l'],"DS"=>$q2['ds_l'],"WB"=>$q2['wb_l']);
						
						echo "<center><table id=t border=0>";
						echo"<tr><th align=center >SUBJECTS<th/><th>MARKS</th><GRADE></tr> ";
						foreach($stud as $key=>$value)
						{
							//if($value>=90) $g='S';
							//else
							echo"<tr><th align=center>".$key."<th/><td>".$value."</td></tr> ";
						}

						
						echo "</table><br/><br/><hr><br/>";
					}
				?>
			</form>
		</center>
	</body>
</html>
<?php
session_destroy();
?>
