<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>flight</h2>
airline: ${reservation.flight.operatingairline}<br>
flight number: ${reservation.flight.flightnumber}<br>
departure city: ${reservation.flight.departurecity}<br>
arrival city: ${reservation.flight.arrivalcity}<br>
date: ${reservation.flight.dateofdeparture}<br>
time: ${reservation.flight.time}<br>


<h2>passenger</h2><br>
name: ${reservation.passenger.firstName}<br>
last name: ${reservation.passenger.lastName}<br>
email: ${reservation.passenger.email}<br>
phone: ${reservation.passenger.phone}<br>

<form action="completeCheckIn" method="post">
enter number of bags :<input type="text" name="numberOfBags">
<input type="hidden" name  ="reservationId" value="${reservation.id}" >
<input type="submit" value="done">
</form>
</body>
</html>