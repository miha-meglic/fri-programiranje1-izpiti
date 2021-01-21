# Repozitorij starih izpitov FRI: Programiranje 1

Stari izpiti za predmet P1 in ENA od možnih rešitev na vsako nalogo.

**Če najdeš boljšo rešitev** in/ali **imaš nove/stare izpite**, podaj Pull Request.

## Hitra navodila za uporabo

Če so testni vhodi v obliki tekstovnih datotek (**Test\*.txt**), se testiranje izvede na sledeči način:

1. Kopiraš tj.exe iz vrhnjega direktorija v mapo kjer se nahaja rešitev
2. Izvedeš ukat `tj.exe <ImePrograma>.java testi testi` **ali** `tj.exe <ImePrograma>.java skriti_testi skriti_testi` (odvisno od testov, ki jih želiš izvesti oz. so na voljo)

Če so vhodi v obliki programov (**Test\*.java**), uporabiš skripto `.\run_tests.bat` **ali** `./run_tests.sh` (odvisno od operacijskega sistema).

P.S. Za uporabo `tj.exe` na non-Windows napravah potrebuješ paket `mono-complete` ali vsaj `mono-runtime`.

## Za razvijalce

Če dodajaš naloge, poskrbi, da kopiraš skripte v mape z rešitvami (kjer je to primerno) in ohranjaš konsistno strukruro repozitorija.
