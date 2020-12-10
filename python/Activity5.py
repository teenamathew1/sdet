#Multiplication table of a number
num = int(input("Enter the number: "))

# use for loop to iterate 10 times
print("Multiplication Table of ",num)
for i in range(1,11):
    print(num," x ",i," = ",num*i)
