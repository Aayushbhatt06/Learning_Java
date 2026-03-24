#include<MKL25Z4.h>

int main(void){
    SIM-> SCGC5 |= 0x400;
    SIM-> SCGC5 |= 0x200;

    PORTB->PCR[19] = 0x100;
    PTB->PDDR|= 0x80000;

    PORTA->PCR[1] = 0x103;
    PTA->PDDR&= ~ 0x02;
    while(1){
        if(PTA->PDIR & 0x02){
            PTB->PSOR = 0x80000;
        }else{
            PTB->PCOR = 0x80000;
        }
    } 
}