<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Locations:
<table>
<tr>
<th>ID</th>
<th>FLIGHT NUMBER</th>
<th>AIRLINE</th>
<th>FROM</th>
<th>TO</th>
<th>DEPARTURE DATE</th>
<th>DEPARTURE TIME</th>
</tr>
<c:forEach items="${flights}" var="flights">
<tr>
<td>${flights.id}</td>
<td>${flights.flightNumber}</td>
<td>${flights.operatingAirline}</td>
<td>${flights.departureCity}</td>
<td>${flights.arrivalCity}</td>
<td>${flights.dateOfDeparture}</td>
<td>${flights.estimateDepartureTime}</td>
</tr>
</c:forEach>
</table>

</body>
</html>