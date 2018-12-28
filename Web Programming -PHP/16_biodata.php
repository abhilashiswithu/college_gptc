<?php
	include("16_header.php");
	$file = fopen("16_biodata.txt","r")or
			exit("Unable to open the file");
	while(!feof($file))
	{
		echo fgets($file)."<br/>";
	}
	fclose($file);
	include("16_footer.php");
?>
