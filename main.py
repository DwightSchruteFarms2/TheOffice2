def add_numbers(a, b):
    if isinstance(b, str):
        b = int(b)
    return a + b

print(add_numbers(1, 2))
print(add_numbers(1, "2"))  # This will now work correctly