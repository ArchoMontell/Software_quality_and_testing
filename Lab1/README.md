1) Назви класів мають бути із великої літери, тобто humanIMB (неправильно) - HumanBMI (правильно)
2) Назви змінних повинні бути зрозумілими, навіть коли немає коментарів, W, H, imb (неправильно) - weight, height, bmi (Body Mass Index) (правильно)
3) imb оголосили як static, хоча так не має бути, адже кожен екземпляр класу повинен мати своє значення BMI
4) Так само із методами  takeImt, Result, вони не мають бути static
5) takeW, putW, takeH, putH можна замінити на стандартні get і set
6) string можна було б залишити просто як "", а не присвоювати null
7) Можна винести розрахунок BMI в окремий метод, якщо щось потрібно буде змінити - це буде набагато простіше реалізувати
8) Тут відсутня валідація вхідних даних (weight, height), а якщо ми введемо нулі то нам виведе null
9) Відсутній пустий рядок між оголошенням змінних та методом (line 10)
10) Відсутній пробіл після ">=" (line 35)
11) Не getResult, а getBmiCategory