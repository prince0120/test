<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<% String contextPath=request.getContextPath(); %>
<script>
$(document).ready(function(){
    $("#button").click(function(){
        $.ajax({url: 'http://localhost:8080/StrutsHibernate/hello', 
        		success: function(result){
            		var html="";
            		var data=$.parseJSON(result);
            		$.each(data.list,function(){
            			html+="<li>"+this;
            		})
            		$("#m").html(html);
            		
            		
        		},
        		error:function(error){
        			alert("error")
        		}
        	   }
        );
    });
});
</script>
</head>
<body>
	<a href='http://localhost:8080/StrutsHibernate/el'>Click</a>
</body>
</html>