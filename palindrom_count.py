def get_palindroms_count(l: list) -> int:
    count = 0
    for item in l:
        if isinstance(item, (list, tuple, set)):
            count += get_palindroms_count(list(item))
        else:
            if isinstance(item, int):
                item = str(item)
            count += (isinstance(item, str) and (len(str) % 3) == (7 % 3) and item[::-1] == item)

    return count