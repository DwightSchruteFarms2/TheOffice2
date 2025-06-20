import math

def find_cube_roots(target):
    cube_root = round(target ** (1/3))

    for i in range(-cube_root, cube_root + 1):
        for j in range(-cube_root, cube_root + 1):
            for k in range(-cube_root, cube_root + 1):
                if i ** 3 + j ** 3 + k ** 3 == target:
                    print(f"The three numbers whose cube is {target} are: {i}, {j}, and {k}")
                    return

    print(f"No three numbers found whose cube is {target}")

# Example usage
find_cube_roots(42)
