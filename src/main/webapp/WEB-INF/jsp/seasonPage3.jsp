<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
	<title>Color Page</title>
</head>

<body>
	<h1>Favorite Things Exercise</h1>
	
	<c:url var="seasonPage" value="/seasonPage3"/>
	<form action = "${seasonPage}" method = "POST">
		<label for = "season">What is your favorite season?</label>
		<input type = "text" name="season" id = "season"/>
		
		<input type = "submit" value = "next >>>"/>
	</form>
</body>

</html>