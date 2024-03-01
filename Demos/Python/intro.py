# print to the console
# double "" or single '' quotes work
# CTRL + / for comment 
print('hello world')

flag = True # boolean
age = 30 # integer

name = input("Please provide your name") # string

print("Your name is", name) # comma in print adds spaces

name = "anoush" # string

print("my name is" + name) # + is raw concatenation and doesn't add spaces so output here will be "my name isanoush"

age = 30 #int

# print("my age is " + age) # error here because you can't concatenate ints to strings
print("my age is " + str(age)) # this works because we're casting to string before concatenating

age = int(input("Please enter your age")) # input gives a string, but it's immedaitely casted to int
age = age + 1 # now age is int, we can perform mathematical operations on it, like addition
print("next year you will be", age, "years old") # the comma in print() allows for combining strings and ints (it converts for you!)

total = 1 + 3 + 5 + 7 + 9 + 11 # int
average = total/6 # float

totalString = "Total = " + str(total) # casting to string so concatenation works
averageString = "Average = " + str(average) # casting to string so concatenation works

print(totalString) # Total = 36
print(averageString) # Average = 6.0

print(type(average)) # type(x) gives you the datatype of x, but you must print if you want to see it.