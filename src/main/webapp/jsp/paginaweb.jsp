<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>

<html>
	<head>
		<title>JSPvsJS</title>
	</head>
	<body>
        Server Date: <%= new Date().toString() %>
        <br/>
	    <script language="javascript">
	        var data = new Date();
		    document.write("Client Date: ");
		    document.write(data);
	    </script>
	</body>
</html>