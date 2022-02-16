<%-- 
    Document   : thanks
    Created on : Aug 24, 2018, 11:19:01 AM
    Author     : Chris.Cusack
--%>

<%@page import="edu.nbcc.user.User"%>
<%@page import="edu.nbcc.user.IUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddToEmailListServlet</title>
    </head>
    <body>
        
        <h1>Thanks for joining our email list using MVC</h1>
        <p>Here is the information that you entered:</p>
        
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First name:</td>
                <td></td>
            </tr>
            <tr>
                <td align="right">Last name:</td>
                <td></td>
            </tr>
            <tr>
                <td align="right">Email Address:</td>
                <td></td>
            </tr>
        </table>
        <h2>
            To enter another email address, click on the Back <br>
            button in your browser or the Return button shown <br>
            below.
        </h2>
        <form action="index.jsp" method="post">
            <input type="submit" value="Return">
        </form>   
    </body>
</html>

