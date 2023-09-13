<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
$(document).ready(function() {
    $("form").submit(function(event) {
    
    let memberInfo = [
    $("input[name='userid']").val(),
    $("input[name='userpw']").val(),
    $("selected[name='username']").val(),
    $("input[name='email']").val()
    ]; 
    param.push(memberInfo);
    })};
    
    
</script>
</head>
<body>
	<form action="/springPractice/member/join" method="get">
		<input type="text" name="userid"></input>
		<input type="password" name="userpw"></input>
		<input type="text" name="username"></input>
		<input type="email" name="email"></input>
		<input type="submit" class="submit">
	</form>
</body>
</html>