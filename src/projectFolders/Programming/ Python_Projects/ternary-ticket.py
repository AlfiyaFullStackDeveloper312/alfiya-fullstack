age = int(input("Enter a age:"))
if age <= 5:
 print(f"{age}Free Entry")
elif age <= 12:
   print(f"{age} Ticket Price is: $10")
elif age <= 59:
  print(f"{age} Ticket price is: $20")
else :
  print(f"{age} Ticket Price is: $15")