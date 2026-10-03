numbers = [12, 45, 7, 89, 23]

largest = numbers[0]

for i in range(1, len(numbers)):
    if numbers[i] > largest:
        largest = numbers[i]

print("Largest element:", largest)
