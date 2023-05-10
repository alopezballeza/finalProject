<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.ArrayList"  %>
 <%@ page import="com.hcc.advweb.TripsParameters"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="checkTrips.css" rel="stylesheet">
    
    <title>listTrips</title>
</head>
<body>
    <table>
        <tr id="firstR">
            <th colspan="3"><h1>THESE ARE ALL MY TRIPS SO FAR </h1></th>
        </tr>
        <tr id="secondR">
           
            <td colspan = "3" class="food">
                <h1 class="headers">Around the World:</h1>
                
                <table border='3' id = "list"><th>ID </th><th>Year</th><th>Month</th><th>Country</th><th>City</th><th>Continent</th><th>Weather</th><th>Comments</th></tr>
                
                <c:forEach var="trip" items="${tripsList}">
                	<tr>
                	${trip.id}
                	<td>
                	${trip.year}
                	</td>
                	<td>
                	${trip.year}
                	</td>
                	<td>
                	${trip.month}
                	</td>
                	<td>
                	${trip.country}
                	</td>
                	<td>
                	${trip.city}
                	</td>
                	<td>
                	${trip.continent}
                	</td>
                	<td>
                	${trip.weather}
                	</td>
                	<td>
                	${trip.comments}
                	</td>
                	</tr>
                	
                </c:forEach>
                </table>
    	

            </td>
        

        </tr>
        <tr  id="thirdR">
        <form method="get" action = "TripsListServlet">
            <td >
                <h1>Add a trip: </h1><br>
                
                <label for="year">Year: </label>
                <input type="text"  name="year" placeholder="year">
                <label for="month">Month: </label>
        		<input type="text"  name="month"  placeholder="month">
        		<label for="country">Country: </label>
        		<input type="text"  name="country"  placeholder="country">
        		<label for="city">City: </label>
        		<input type="text"  name="city"  placeholder="city">
        		<label for="continent">Continent: </label>
        		<input type="text"  name="continent"  placeholder="continent">
        		<label for="weather">Weather: </label>
        		<input type="text"  name="weather"  placeholder="weather">
        		<label for="comments">Comments: </label>
        		<input type="text"  name="comments"  placeholder="comments">
        		<label for="id">ID: </label>
        		<input type="text"  name="id"  placeholder="#">
        		

      			<input  type="submit" name="add" value="Add">
      			<p>Make sure to reload the page to see the updated database (trips).</p>
      			<!-- <input  type="submit" name="delete" value="Remove">  -->  
            </td>
           
            
        </form>
        </tr>

    </table>
    
</body>
</html>
