#include <KL25Z4.h>

void delay(int n);

int main(void)
{
    unsigned char digits[] = {0x3F, 0x06, 0x5B, 0x4F, 0x66, 0x6D, 0x7D, 0x07, 0x7F, 0x6F};

    SIM->SCGC5 |= 0x1000;
    SIM->SCGC5 |= 0x2000;

    PORTD->PCR[0] = 0x100;
    PORTD->PCR[1] = 0x100;
    PORTD->PCR[2] = 0x100;
    PORTD->PCR[3] = 0x100;
    PORTD->PCR[4] = 0x100;
    PORTD->PCR[5] = 0x100;
    PORTD->PCR[6] = 0x100;
    PTD->PDDR |= 0x7F;

    PORTE->PCR[0] = 0x100;
    PORTE->PCR[1] = 0x100;
    PTE->PDDR |= 0X03

        while (1)
    {
        PTD->PDOR = digits[2];
        PTE->PSOR = 0x01;
        PTE->pCOR = 0x02;
        delay(8);
        PTD->PDOR = digits[5];
        PTE->PSOR = 0x02;
        PTE->pCOR = 0x01;
        delay(8);
    }
}

void delay(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 7000; j++)
        {
        }
    }
}