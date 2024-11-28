/* Hacer un programa el cual reciba como input segundos 
y que luego convierta esos segundos a horas y minutos
    Input: 3600
    Output: 1 hora, 0 minutos, 0 segundos */

#include <iostream>
using namespace std;

int main () {

    int segundos, horas, minutos, otroSeg;

    cout << "Digite los segundos que desee convertir a horas y minutos: ";
    cin >> segundos;

    // 1h --> 3600seg
    horas = segundos / 3600;
    // 1min --> 60 seg
    minutos = (segundos % 3600)/60;
    // Segundos restantes
    otroSeg = segundos % 60;
    
    cout << horas << " hora(s), " <<  minutos << " minuto(s), " << otroSeg << " segundo(s)" << endl;

}