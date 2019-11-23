'''
    Magnus Frennberg
    Fall 2018
    CS5001
    September 18th, 2018

    Test case #1:
    15k race, 1 hour and 34 minute:
    9.32 miles, 10.05 pace, 5.95 MPH

    Test case #2:
    20k race, 2 hours and 13 minutes:
    12.42 miles, 9:35 pace, 6.26 MPH

    Test case #3:
    1k race, 0 hours and 6 minutes:
    0.62 miles, 9:40 pace, 6.21 MPH
'''

import math

def main():

    #Prompting user for input. Keeping columns short.
    print("Hello there, sport!")
    km_run = float(input("How many kilometers did you run today?\n"))
    print("Amazing! Lets get your time.")
    hours = int(input("How many hours did it take?\n"))
    minutes = int(input("And how many minutes?\n"))

    #Turn km into miles
    miles_run = km_run / 1.61
    
    #Turning the total time into just minutes, enabling math.
    total_time_in_minutes = (hours * 60) + minutes

    #Calculating pace
    pace_minutes = math.floor(total_time_in_minutes / miles_run)
    pace_seconds_as_pct = (total_time_in_minutes / miles_run) - pace_minutes
    pace_seconds = (pace_seconds_as_pct * 60) / 100
    pace_total = pace_minutes + pace_seconds
    
    #Calculating MPH.
    mph = float(miles_run / total_time_in_minutes) * 60

    #Printing out the results to the user.
    print("Wow! You ran {:.2f}".format(miles_run),"miles!\n"
          "Your average pace was {:.2f}".format(pace_total) + ".\n"
          "You had an average speed of {:.2f}".format(mph), "MPH.\nGood job!\n")
main()


