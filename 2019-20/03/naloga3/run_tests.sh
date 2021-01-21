#!/bin/bash

cp *.java testi/
cp *.java skriti_testi/

cd testi
cp ../../../../tj.exe ./
./tj.exe

cd ../skriti_testi
cp ../../../../tj.exe ./
./tj.exe -threads 5
