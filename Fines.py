print("Система расчёта штрафов")

car_speed = int(input())
is_town = str(input())
is_camera = True

fine_for_20_to_40 = 500
fine_for_40_to_60 = 1000
fine_for_60_to_80 = 2000
fine_for_80_and_more = 5000

town_speed = 60
country_speed = 90

if is_town == "True":
  over_speed = car_speed - town_speed
else:
  over_speed = car_speed - country_speed

if over_speed < 20:
  print("Скорость не превышена или превышена незначительно")
elif over_speed >= 20 and over_speed < 40:
  print("Штраф: " + str(fine_for_20_to_40) + " евро")
elif over_speed >= 40 and over_speed < 60:
  print("Штраф: " + str(fine_for_40_to_60) + " евро")
elif over_speed >= 60 and over_speed < 80:
  print("Штраф: " + str(fine_for_60_to_80) + " евро")
elif over_speed >= 80:
  print("Штраф: " + str(fine_for_80_and_more) + " евро")

if (over_speed >= 60):
  print("Лишение водительских прав")