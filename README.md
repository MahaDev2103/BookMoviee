# BookMoviee
Python Flask Application to handle movie booking

Maintain a relational database table with below data:
movie name,
show time,
screen,
seats ,
availability status.


Provide API endpoints for the below:

1. List all the movies running in theatre, the respective show times and availability of tickets- GET /movies
2. Select the showtime and movie of users' interest - POST /bookmovie
3. Cancel the booked ticket 24 hours prior the show time - PUT /cancelticket

For #1, get the movies from db and the seat numbers which are available. 
For #2 , Use API rate limiting, block the no of seats requested in db, return the seat numbers.
For #3 , update db by unblocking the seats, response to customer
