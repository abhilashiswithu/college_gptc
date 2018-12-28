
var xmlHttp;
function sendempID(str)
{
	xmlHttp=GetXmlHttpObject();
	if(xmlHttp==null)
	{
		alert("Browser does not support HTTP Request")
		return;
	
	}
	var url="getemployee.php"
	url=url+"?q="+str;
	url +url+"&sid="+Math.random();
	xmlHttp.onreadystatechange=stateChanged;
	xmlHttp.open("GET",url,true);
	xmlHttp.send(null);
}
function stateChanged()
{
	if(xmlHttp.readyState==4||xmlHttp.radyState=="complete")
	{
		document.getElementById('emp').innerHTML=xmlHttp.responseText;
	}
}
function GetXmlHttpObject()
{
	var xmlHttp=null;
	try
	{
		//Firefox,Opera*.0+,Safari
		xmlHttp=new XMLHttpRequest();
	}
	catch(e)
	{
		//Internet Explorer
		try
		{
			XmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		}
		catch(e)
		{
			XmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttp;
}
