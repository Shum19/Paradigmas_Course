# Ваша задача
# Написать скрипт для расчета корреляции Пирсона между двумя случайными величинами (двумя массивами).
# Можете использовать любую парадигму, но рекомендую использовать функциональную, т.к. в этом примере
# она значительно упростит вам жизнь.
from functools import reduce
from math import sqrt
import numpy as np

arr_x = [24, 27, 26, 21, 20, 31, 26, 22, 20, 18, 30, 29, 24, 26]
arr_y = [100, 115, 117,119, 134, 94, 105, 103, 111, 124, 122, 109, 110, 86]
arr_test = [1.3, 2.8, 3.4, 4.1, 5.3, 6.6, 7.1, 8.2, 9.3, 10.3]
arr_test_2 = [20.3, 18.9, 18.1, 17.1, 16.3, 15.2, 14.5, 13.1, 12.8, 11.2]

# Способ_1: Используется и функциональная и процедурная и структурная парадигма для вачесления корреляции Пирсона
def corr(arr_x, arr_y):
    avg_x = reduce(lambda x, y: x + y, arr_x) / len(arr_x)
    avg_y = reduce(lambda x, y: x + y, arr_y) / len(arr_y)
    sum_xy = 0
    pow_sum_x = 0
    pow_sum_y = 0
    for i in range(len(arr_x)):
        sum_xy += (arr_x[i] - avg_x)*(arr_y[i] - avg_y)
        pow_sum_x += pow((arr_x[i] - avg_x), 2)
        pow_sum_y += pow((arr_y[i] - avg_y), 2)
    return sum_xy/sqrt(pow_sum_x * pow_sum_y)


print(corr(arr_x, arr_y))

# Способ_2 Используется функциональная для вачесления корреляции Пирсона
print(np.corrcoef(arr_x, arr_y)[0, 1])