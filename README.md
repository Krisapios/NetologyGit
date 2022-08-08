![Random logo](https://i.imgur.com/WUtsRM9.png)

# *SalesManager*

## Программа для определения наилучшей продуктивности сотрудника

### Как работате программа:
1. В методе *Main* записываем в массив показатели продаж всех сотрудников
2. Через метод *foreach* перебираем все показатели.
3. Самый большой показатель записываем в переменную *max*
4. Выводим максимальный показатель на экран.

## [Ссылка на GHitHub](https://github.com/Krisapios/NetologyGit)

# Кусок кода
```public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
```

