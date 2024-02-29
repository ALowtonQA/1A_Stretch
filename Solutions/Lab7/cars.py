companies = []
sales = []

with open("carSale.csv") as file:
    lines = file.readlines()

for x in range(0, len(lines), 2):
    data = lines[x+1].strip().split(",") 
    sales.append(list(map(int, data)))
    companies.append(lines[x].strip())

print(companies)
print(sales)

for i in range(len(sales[0])):
    sum = 0
    for entry in sales:
        sum += entry[i]
    print(sum)

grandTotal = 0

for entry in sales:
    for value in entry: 
        grandTotal += value

print("Grand Total =", grandTotal)