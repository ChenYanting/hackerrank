str = input()

has_alnum = False
has_alpha = False
has_digit = False
has_lower = False
has_upper = False

for i in list(str):
    has_alnum = True if has_alnum or i.isalnum() else False
    has_alpha = True if has_alpha or i.isalpha() else False
    has_digit = True if has_digit or i.isdigit() else False
    has_lower = True if has_lower or i.islower() else False
    has_upper = True if has_upper or i.isupper() else False

print(has_alnum)
print(has_alpha)
print(has_digit)
print(has_lower)
print(has_upper)
