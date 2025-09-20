# создание списка из строки 'abcdef'
txt = 'abcdef'
lst = list(txt)  # ['a', 'b', 'c', 'd', 'e', 'f']

# организация стека (используя список)
stack = []
stack.append('a')
stack.append('b') 
stack.append('c')
print(stack)  # Вывод: ['a', 'b', 'c']

# Для извлечения из стека можно использовать pop()
last_element = stack.pop()  # удаляет и возвращает 'c
