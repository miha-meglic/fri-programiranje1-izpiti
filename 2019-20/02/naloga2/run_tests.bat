@echo off

copy /Y *.java testi\
copy /Y *.java skriti_testi\

cd testi
copy /Y ..\..\..\..\tj.exe .\
tj.exe

cd ../skriti_testi
copy /Y ..\..\..\..\tj.exe .\
tj.exe -threads 5

pause