companies = []
sales = []

with open("carSale.csv") as file:
    lines = file.readlines()

# using a range where values increase by 2, we can skip from 0 -> 2 -> 4 etc..
# this allows us to target those lines seperately
for x in range(0, len(lines), 2):
    # using x+1 here so we can get lines 1, 3, 5, 7, 9
    # also using split, to create lists of each value, rather than one long string
    data = lines[x+1].strip().split(",") 

    # before appending to the sales list, we map, converting each value from string to int
    # for more info on map, see part 7, 8 & 9 of the previous lab (user-defined functions)
    # See here for w3 schools: https://www.w3schools.com/python/ref_func_map.asp
    sales.append(list(map(int, data)))

    companies.append(lines[x].strip()) # using x here so we can get lines 0, 2, 4, 6, 8

print(companies)
print(sales)

# loop from i=0 to i=8
for i in range(len(sales[0])):
    sum = 0
    for entry in sales: # loop through each "inner list" (sales is a list of 5 lists)
        sum += entry[i] # for each inner list, get the entry[i] value and add them together

    # after each entry[i] value is added together, you've got your total for that month
    # see the table at the top of the lab doc for more clarity
    # print this sum, then you're ready to move onto the next value for [i] and repeat this process
    print(sum)

grandTotal = 0
for entry in sales: # loop through each of the 5 lists within the sales list
    for value in entry: # loop through each value in the inner list
        grandTotal += value # add these values together until every value in every list has been added

print("Grand Total =", grandTotal)

